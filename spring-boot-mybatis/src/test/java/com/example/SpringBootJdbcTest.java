package com.example;

import com.example.csv.CSVTest;
import com.example.dao.DailyStockMapper;
import com.example.model.DailyStock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class SpringBootJdbcTest {

    @Autowired
    DailyStockMapper dailyStockMapper;

    @Test
    public void findAll() throws ParseException, IOException {
        final List<DailyStock> dailyStocks = CSVTest.readCSV("E:/603088.csv");
        for(DailyStock stock :dailyStocks){
            dailyStockMapper.insert(stock);
        }
    }

}