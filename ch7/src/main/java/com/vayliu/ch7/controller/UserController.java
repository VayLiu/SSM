package com.vayliu.ch7.controller;

import com.vayliu.ch7.pojo.MapUser;
import com.vayliu.ch7.pojo.User;
import com.vayliu.ch7.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: VayLiu
 **/

@Controller("userController")
public class UserController {

    @Autowired
    private UserService userService;

    public void selectAllByMap() {
        Map<String, Object> param = new HashMap<>();
        param.put("uname", "Liu");
        param.put("usex", "男");
        List<User> userList = userService.selectAllUserByMap(param);
        System.out.println(userList);
    }

    public void selectAllByJavaBean() {
        User user = new User();
        user.setUname("Liu");
        user.setUsex("男");
        List<User> userList = userService.selectAllUserByJavaBean(user);
        System.out.println(userList);
    }

    public void selectAllUserByJavaBeanWithSql() {
        User user = new User(null, "Liu", "男", null);
//        user.setUname("Liu");
//        user.setUsex("男");
        List<User> userList = userService.selectAllUserByJavaBeanWithSql(user);
        System.out.println(userList);
    }

    public void selectAllUserReturnMap() {
        List<Map<String, Object>> mapList = userService.selectAllUserReturnMap();
        for (Map<String, Object> map : mapList) {
            System.out.println(map);
        }
    }

    public void selectAllUserByResultMap() {
        List<MapUser> mapList = userService.selectAllUserByResultMap();
        for (MapUser map : mapList) {
            System.out.println(map);
        }
    }




}
