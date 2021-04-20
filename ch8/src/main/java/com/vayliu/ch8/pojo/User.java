package com.vayliu.ch8.pojo;

import java.util.List;

/**
 * @author: VayLiu
 **/


public class User {

    private Integer uid;
    private String uname;
    private String usex;
    private Double account;

    public User() {
    }

    public User(Integer uid, String uname, String sex, Double account) {
        this.uid = uid;
        this.uname = uname;
        this.usex = sex;
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

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                ", account=" + account +
                '}';
    }
}
