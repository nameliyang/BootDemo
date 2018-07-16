package com.example.model;

import java.util.Date;

public class DailyStock {

    /**
     * 日期
     */
    private Date date;

    private String code;

    private String name;

    /**
     * 收盘价
     */
    private Double tclose;

    /**
     * 最高价
     */
    private Double high;

    /**
     * 最低价
     */
    private Double low;

    /**
     * 开盘价
     */
    private Double topen;

    /**
     * 前收盘
     */
    private Double lclose;

    /**
     * 涨跌额
     */
    private Double chg;
    /**
     * 涨跌幅
     */
    private Double pchg;

    /**
     * 换手率
     */
    private Double turnover;

    /**
     * 成交量
     */
    private Double voturnover;

    /**
     * 成交金额
     */
    private Double vaturnove;

    /**
     * 总市值
     */
    private Double tcap;

    /**
     * 流通市值
     */
    private Double mcap;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTclose() {
        return tclose;
    }

    public void setTclose(Double tclose) {
        this.tclose = tclose;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getTopen() {
        return topen;
    }

    public void setTopen(Double topen) {
        this.topen = topen;
    }

    public Double getLclose() {
        return lclose;
    }

    public void setLclose(Double lclose) {
        this.lclose = lclose;
    }

    public Double getChg() {
        return chg;
    }

    public void setChg(Double chg) {
        this.chg = chg;
    }

    public Double getPchg() {
        return pchg;
    }

    public void setPchg(Double pchg) {
        this.pchg = pchg;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public Double getVoturnover() {
        return voturnover;
    }

    public void setVoturnover(Double voturnover) {
        this.voturnover = voturnover;
    }

    public Double getVaturnove() {
        return vaturnove;
    }

    public void setVaturnove(Double vaturnove) {
        this.vaturnove = vaturnove;
    }

    public Double getTcap() {
        return tcap;
    }

    public void setTcap(Double tcap) {
        this.tcap = tcap;
    }

    public Double getMcap() {
        return mcap;
    }

    public void setMcap(Double mcap) {
        this.mcap = mcap;
    }
}
