package com.example.csv;

import com.example.model.DailyStock;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.List;

public class CodeResolve {

    private static final String BASEPATH = "E:/CSV";

    private String code;

    private File file;

    public static void main(String[] args) throws IOException {
        CodeResolve codeResolve = new CodeResolve();
        codeResolve.download("603088","20170713","20180716");
    }

    /**
     * http://quotes.money.163.com/service/chddata.html?code=0603088&start=20180713&end=20180716&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP
     * @param stockCode
     * @param start
     * @param end
     * @throws IOException
     */
    public File  download(String stockCode,String start,String end ) throws IOException {
        File basePath = new File(BASEPATH);
        if(!basePath.exists()){
            basePath.mkdir();
        }
        file = new File(BASEPATH + "/" + stockCode + ".csv");
        FileUtils.copyURLToFile(new URL("http://quotes.money.163.com/service/chddata.html?code=0" + stockCode + "&start=" + start + "&end=" + end + "&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP"), file);
        return file;
    }


    public void insertDb() throws IOException, ParseException {
        List<DailyStock> dailyStocks = CSVUtil.readCSV(FileUtils.openInputStream(file));

    }
}
