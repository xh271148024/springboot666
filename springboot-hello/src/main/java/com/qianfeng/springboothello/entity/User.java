package com.qianfeng.springboothello.entity;

import java.util.Date;

/**
 * @author:wh
 * @Date:2019/7/29
 */
public class User {
    private String name;
    private String password;
    private Date entryDate;

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
