package com.vayliu.ch7.pojo;

import java.util.List;

/**
 * @author: VayLiu
 **/


public class Orders {

    private Integer id;
    private String ordersn;
    // 多对多种的另一个一对多
    private List<Product> productList;

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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", ordersn='" + ordersn + '\'' +
                ", productList=" + productList +
                '}';
    }
}
