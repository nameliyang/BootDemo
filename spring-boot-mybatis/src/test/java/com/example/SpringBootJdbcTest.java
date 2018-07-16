package com.example;

import com.example.csv.CSVUtil;
import com.example.csv.CodeResolve;
import com.example.dao.DailyStockMapper;
import com.example.model.DailyStock;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class SpringBootJdbcTest {

    @Autowired
    DailyStockMapper dailyStockMapper;

    public void downloadAndSave() throws ParseException, IOException {
        CodeResolve codeResolve = new CodeResolve();
        File file = codeResolve.download("603088","20160712","20170712");
        List<DailyStock> dailyStocks = CSVUtil.readCSV(FileUtils.openInputStream(file));
        dailyStockMapper.batchInsert(dailyStocks);
    }

    @Test
    public void paraData(){
        DailyStock stock = new DailyStock();
        stock.setStartDate("2016-06-01");
        stock.setEndDate("2018-07-16");
        List<DailyStock> dailyStocks = dailyStockMapper.listBySo(stock);

        System.out.println("-------------------------------------------------------------------------");
        int yangCount = 0;
        int goodCount = 0;
        for(int i = 0;i<dailyStocks.size();i++){
            DailyStock s = dailyStocks.get(i);
            if (isBigYang(s)) {

                if((s.getHigh() - s.getTclose())*100/s.getHigh()>=5 ){
                    continue;
                }

                yangCount++;
                if(i+1 <= dailyStocks.size()){
                    DailyStock nextDay = dailyStocks.get(i+1);
                    if(nextDay.getTclose() > s.getTclose()){
                        goodCount++;
                        System.out.println(s);
                    }else{
                        System.out.println("eror--------------->"+s);
                    }
                }
            }
        }
        System.out.println("rate = "+(goodCount*100/yangCount));
        System.out.println("-------------------------------------------------------------------------");
    }

    public boolean isBigYang(DailyStock stock){
        //开盘价
        Double topen = stock.getTopen();
        Double tclose = stock.getTclose();
        if(tclose < topen){
            return false;
        }
        if( (tclose - topen)*100/topen>=3){
            return true;
        }
        return false;
    }
}