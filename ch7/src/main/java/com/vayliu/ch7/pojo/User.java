package com.vayliu.ch7.pojo;

import java.util.List;

/**
 * @author: VayLiu
 **/


public class User {

    private Integer uid;
    private String uname;
    private String usex;
    private Double account;
    
    private List<Orders> ordersList;

    public User() {
    }

    public User(Integer uid, String uname, String sex, Double account) {
        this.uid = uid;
        this.uname = uname;
        this.usex = sex;
        this.account = account;
    }

    public User(Integer uid, String uname, String usex, Double account, List<Orders> ordersList) {
        this.uid = uid;
        this.uname = uname;
        this.usex = usex;
        this.account = account;
        this.ordersList = ordersList;
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

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                ", account=" + account +
                ", ordersList=" + ordersList +
                '}';
    }
}
