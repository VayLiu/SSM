package com.vayliu.ch8.controller;

import com.vayliu.ch8.pojo.User;
import com.vayliu.ch8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: VayLiu
 **/

@Controller("userController")
public class UserController {

    @Autowired
    private UserService userService;

    public void selectAllUserByIf() {
        User ifUser = new User();
        ifUser.setUname("张");
        ifUser.setUsex("男");
        List<User> userList = userService.selectAllUserByIf(ifUser);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void selectAllUserByChoose() {
        User chooseUser = new User();
        chooseUser.setUname("张");
        chooseUser.setUsex("男");
        List<User> userList = userService.selectAllUserByChoose(chooseUser);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void selectAllUserByTrim() {
        User chooseUser = new User();
        chooseUser.setUname("张");
        chooseUser.setUsex("男");
        List<User> userList = userService.selectAllUserByTrim(chooseUser);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void selectAllUserByWhere() {
        User whereUser = new User();
        whereUser.setUname("张");
        whereUser.setUsex("男");
        List<User> userList = userService.selectAllUserByWhere(whereUser);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void updateUserBySet() {
        User setUser = new User();
        setUser.setUid(1);
        setUser.setUname("张九");
        setUser.setUsex("男");
        setUser.setAccount(8888.88);
        int row = userService.updateUserBySet(setUser);
        System.out.println(row);

    }

    public void selectUserByForeach() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        List<User> userList = userService.selectUserByForeach(list);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void selectUserByBind() {
        User bindUser = new User();
        bindUser.setUname("张");
        List<User> userList = userService.selectUserByBind(bindUser);
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
