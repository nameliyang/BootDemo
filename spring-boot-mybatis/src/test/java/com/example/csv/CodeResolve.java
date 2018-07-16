package com.example.csv;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CodeResolve {

    private static final String BASEPATH = "E:/CSV";

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
    public void download(String stockCode,String start,String end ) throws IOException {
        File basePath = new File(BASEPATH);
        if(!basePath.exists()){
            basePath.mkdir();
        }
        FileUtils.copyURLToFile(new URL("http://quotes.money.163.com/service/chddata.html?code=0" + stockCode + "&start=" + start + "&end=" + end + "&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP"), new File(BASEPATH + "/" + stockCode + ".csv"));
    }

}
