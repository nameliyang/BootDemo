package com.example.base;

import java.util.Date;

public class AbstractBo {

    private Date createdTime;

    private Date updateTime;

    private Integer lockversion;

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getLockversion() {
        return lockversion;
    }

    public void setLockversion(Integer lockversion) {
        this.lockversion = lockversion;
    }
}
