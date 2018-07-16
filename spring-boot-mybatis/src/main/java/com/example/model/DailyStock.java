package com.example.model;

import java.util.Date;

public class DailyStock {

    private Integer id;

    private Date date;

    private String code;

    private String name;

    private Double tclose;

    private Double high;

    private Double low;

    private Double topen;

    private Double lclose;

    private Double chg;

    private Double pchg;

    private Double turnover;

    private Long voturnover;

    private Double vaturnove;

    private Double tcap;

    private Double mcap;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Long getVoturnover() {
        return voturnover;
    }

    public void setVoturnover(Long voturnover) {
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

    @Override
    public String toString() {
        return "DailyStock{" +
                "id=" + id +
                ", date=" + date +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", tclose=" + tclose +
                ", high=" + high +
                ", low=" + low +
                ", topen=" + topen +
                ", lclose=" + lclose +
                ", chg=" + chg +
                ", pchg=" + pchg +
                ", turnover=" + turnover +
                ", voturnover=" + voturnover +
                ", vaturnove=" + vaturnove +
                ", tcap=" + tcap +
                ", mcap=" + mcap +
                '}';
    }
}