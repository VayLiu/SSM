package com.vayliu.ch5.pojo;

/**
 * 实体类
 *
 * @author: VayLiu
 **/


public class MyUser {
    private Integer uid;
    private String uname;
    private double account;

    public MyUser() {
    }

    public MyUser(Integer uid, String uname, double account) {
        this.uid = uid;
        this.uname = uname;
        this.account = account;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", account=" + account +
                '}';
    }
}