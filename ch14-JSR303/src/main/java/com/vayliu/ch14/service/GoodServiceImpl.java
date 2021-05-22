package com.vayliu.ch14.service;

import com.vayliu.ch14.pojo.Good;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author: VayLiu
 **/

@Service
public class GoodServiceImpl implements GoodService {

    private static ArrayList<Good> goods = new ArrayList<Good>();

    @Override
    public boolean save(Good good) {
        goods.add(good);
        return true;
    }

    @Override
    public ArrayList<Good> getGoods() {
        return goods;
    }

}
