package com.example;

import com.csvreader.CsvReader;
import com.example.model.DailyStock;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CSVTest {

    public static void main(String[] args) {
            readCSV("E:/600000.csv");
    }


    public static void readCSV(String csvFilePath) {
        try {
            List<DailyStock> dailyStockList = new ArrayList<>();
            // 用来保存数据
            // 定义一个CSV路径
            // 创建CSV读对象 例如:CsvReader(文件路径，分隔符，编码格式);
            CsvReader reader = new CsvReader(csvFilePath, ',', Charset.forName("GBK"));
            // 跳过表头 如果需要表头的话，这句可以忽略
            reader.readHeaders();
            // 逐行读入除表头的数据
            while (reader.readRecord()) {
                String rawRecord = reader.getRawRecord();
                DailyStock stock = new DailyStock();
                System.out.println(rawRecord);
                buildDailyStock(rawRecord,stock);
                dailyStockList.add(stock)
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void buildDailyStock(String rawRecord, DailyStock stock) throws ParseException {
        String[] split = rawRecord.split(",");

        stock.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(split[0]));
        stock.setName(split[1]);
        stock.setTclose(Double.parseDouble(split[1]));




    }
}
