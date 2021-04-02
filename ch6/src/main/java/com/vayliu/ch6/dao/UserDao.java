package com.vayliu.ch6.dao;

import com.vayliu.ch6.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: VayLiu
 **/

@Mapper
public interface UserDao {
    public User selectUserById(Integer uid);
    public List<User> selectAllUser();
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(Integer uid);
}
