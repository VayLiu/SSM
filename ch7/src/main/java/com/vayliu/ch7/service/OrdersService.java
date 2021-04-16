package com.vayliu.ch7.service;

import com.vayliu.ch7.dao.OrdersDao;
import com.vayliu.ch7.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: VayLiu
 **/

@Service("ordersService")
public class OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    public List<Orders> selectAllOrdersAndProducts() {
        return ordersDao.selectAllOrdersAndProducts();
    }

}
