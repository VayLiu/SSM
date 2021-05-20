package com.vayliu.ch12.service;

import com.vayliu.ch12.pojo.User;

import java.util.ArrayList;

/**
 * @author: VayLiu
 **/


public interface UserService {

    boolean addUser(User user);

    ArrayList<User> getUsers();

}
