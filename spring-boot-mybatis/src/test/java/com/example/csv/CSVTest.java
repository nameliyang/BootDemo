package com.example.csv;

import com.csvreader.CsvReader;
import com.example.model.DailyStock;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CSVTest {


    public static void main(String[] args) throws ParseException, IOException {
        final List<DailyStock> dailyStocks = readCSV("E:/603088.csv");
        System.out.println(dailyStocks);
    }


    public static  List<DailyStock>  readCSV(String csvFilePath) throws ParseException, IOException {
        return readCSV( FileUtils.openInputStream(new File(csvFilePath)));
    }

    public static  List<DailyStock>  readCSV(InputStream inputStream) throws ParseException {
        try {
            List<DailyStock> dailyStockList = new ArrayList<>();
            // 用来保存数据
            // 定义一个CSV路径
            // 创建CSV读对象 例如:CsvReader(文件路径，分隔符，编码格式);
            CsvReader reader = new CsvReader(inputStream, ',', Charset.forName("GBK"));
            // 跳过表头 如果需要表头的话，这句可以忽略
            reader.readHeaders();
            // 逐行读入除表头的数据
            while (reader.readRecord()) {
                String rawRecord = reader.getRawRecord();
                DailyStock stock = new DailyStock();
                System.out.println(rawRecord);
                buildDailyStock(rawRecord,stock);
                dailyStockList.add(stock);
            }
            reader.close();
            return dailyStockList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void buildDailyStock(String rawRecord, DailyStock stock) throws ParseException {
        String[] split = rawRecord.split(",");
        stock.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(split[0]));
        stock.setCode(split[1].startsWith("'")?split[1].substring(1,split[1].length()):split[1]);
        stock.setName(split[2]);
        stock.setTclose(Double.parseDouble(split[3]));
        stock.setHigh(Double.parseDouble(split[4]));
        stock.setLow(Double.parseDouble(split[5]));
        stock.setTopen(Double.parseDouble(split[6]));
        stock.setLclose(Double.parseDouble(split[7]));
        stock.setChg(Double.parseDouble(split[8]));
        stock.setPchg(Double.parseDouble(split[9]));
        stock.setTurnover(Double.parseDouble(split[10]));
        stock.setVoturnover(Long.parseLong(split[11]));
        stock.setVaturnove(Double.parseDouble(split[12]));
        stock.setTcap(Double.parseDouble(split[13]));
        stock.setMcap(Double.parseDouble(split[14]));


    }
}
