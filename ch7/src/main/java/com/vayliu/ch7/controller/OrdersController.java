package com.vayliu.ch7.controller;

import com.vayliu.ch7.pojo.Orders;
import com.vayliu.ch7.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author: VayLiu
 **/

@Controller("ordersController")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    public void selectAllOrdersAndProducts() {

        List<Orders> ordersList = ordersService.selectAllOrdersAndProducts();

        for (Orders orders : ordersList) {
            System.out.println(orders);
        }

    }

}
