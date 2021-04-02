package com.vayliu.ch6.po;

/**
 * spring-test数据库 中 t_user表 中的持久化类
 *
 * @author: VayLiu
 **/


public class User {
    private Integer uid;
    private String uname;
    private double account;

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
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", account=" + account +
                '}';
    }
}
