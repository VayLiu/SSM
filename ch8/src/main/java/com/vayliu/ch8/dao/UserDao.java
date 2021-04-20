package com.vayliu.ch8.dao;

import com.vayliu.ch8.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: VayLiu
 **/


@Mapper
public interface UserDao {

    List<User> selectAllUserByIf(User user);

    List<User> selectAllUserByChoose(User user);

    List<User> selectAllUserByTrim(User user);

    List<User> selectAllUserByWhere(User user);

    int updateUserBySet(User user);

    List<User> selectUserByForeach(List list);

    List<User> selectUserByBind(User user);

}
