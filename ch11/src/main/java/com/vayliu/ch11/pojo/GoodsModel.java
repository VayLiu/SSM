package com.vayliu.ch11.pojo;

import java.util.Date;

/**
 * @author: VayLiu
 **/


public class GoodsModel {

    private String name;
    private Double price;
    private Integer number;
    private Date date;

    public GoodsModel() {
    }

    public GoodsModel(String name, Double price, Integer number, Date date) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GoodsModel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", date=" + date +
                '}';
    }
}
