package com.vayliu.ch7.dao;

import com.vayliu.ch7.pojo.MapUser;
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
}
