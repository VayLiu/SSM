package com.vayliu.ch14.service;

import com.vayliu.ch14.pojo.Good;

import java.util.ArrayList;

public interface GoodService {

    boolean save(Good good);

    ArrayList<Good> getGoods();

}
