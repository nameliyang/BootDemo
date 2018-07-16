package com.example.dao;

import com.example.model.DailyStock;

import java.util.List;

public interface DailyStockMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DailyStock record);

    int insertSelective(DailyStock record);

    DailyStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DailyStock record);

    int updateByPrimaryKey(DailyStock record);

    void batchInsert(List<DailyStock> dailyStocks);

    List<DailyStock> listBySo(DailyStock dailyStock);

}