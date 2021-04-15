package com.vayliu.ch7.dao;

import com.vayliu.ch7.pojo.MapUser;
import com.vayliu.ch7.pojo.SelectPersonById;
import com.vayliu.ch7.pojo.SelectUserOrdersById;
import com.vayliu.ch7.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author: VayLiu
 **/


@Mapper
public interface UserDao {

    List<User> selectAllUserByMap(Map<String, Object> param);

    List<User> selectAllUserByJavaBean(User user);

    List<User> selectAllUserByJavaBeanWithSql(User user);

    List<Map<String, Object>> selectAllUserReturnMap();

    List<MapUser> selectAllUserByResultMap();

    List<User> selectUserOrdersById1(Integer uid);

    List<User> selectUserOrdersById2(Integer uid);

    List<SelectUserOrdersById> selectUserOrdersById3(Integer uid);
}
