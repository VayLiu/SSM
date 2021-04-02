package com.vayliu.ch6.controller;

import com.vayliu.ch6.dao.UserDao;
import com.vayliu.ch6.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author: VayLiu
 **/

@Controller("userController")
public class UserController {

    @Autowired
    private UserDao userDao;

    public void test() {
        // 通过ID查询
//        User user = userDao.selectUserById(1);
//        System.out.println(user);
        // 查询所有
        List<User> userList = userDao.selectAllUser();
        System.out.println(userList);

        // 添加数据
        User user = new User();
        user.setUname("刘锐松");
        user.setAccount(9000);
        int num = userDao.addUser(user);
        if (num > 0) {
            System.out.println("添加成功");
        }

        // 查询所有
        userList = userDao.selectAllUser();
        System.out.println(userList);
    }
}
