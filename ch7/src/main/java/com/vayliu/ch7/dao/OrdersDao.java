package com.vayliu.ch7.dao;

import com.vayliu.ch7.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersDao {

    List<Orders> selectOrdersByUserId(Integer user_id);

    List<Orders> selectAllOrdersAndProducts();

}
