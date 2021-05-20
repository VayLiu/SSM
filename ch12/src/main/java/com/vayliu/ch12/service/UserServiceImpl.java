package com.vayliu.ch12.service;

import com.vayliu.ch12.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author: VayLiu
 **/

@Service
public class UserServiceImpl implements UserService{

    // 使用静态集合变量users模拟数据库
    private static ArrayList<User> users = new ArrayList<User>();

    @Override
    public boolean addUser(User user) {
        if (!"IT民工".equals(user.getCareer())){
            users.add(user);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<User> getUsers() {
        return users;
    }
}
