package com.vayliu.ch7.pojo;

import java.util.List;

/**
 * @author: VayLiu
 **/


public class SelectUserOrdersById {

    private Integer uid;
    private String uname;
    private String usex;
    private Double account;
    private Integer id;
    private String ordersn;

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

    public void setAccount(Double account) {
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    @Override
    public String toString() {
        return "SelectUserOrdersById{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                ", account=" + account +
                ", id=" + id +
                ", ordersn='" + ordersn + '\'' +
                '}';
    }
}
