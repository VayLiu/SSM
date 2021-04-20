package com.vayliu.ch8.service;

import com.vayliu.ch8.dao.UserDao;
import com.vayliu.ch8.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: VayLiu
 **/

@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> selectAllUserByIf(User user){
        return userDao.selectAllUserByIf(user);
    }

    public List<User> selectAllUserByChoose(User user){
        return userDao.selectAllUserByChoose(user);
    }

    public List<User> selectAllUserByTrim(User user){
        return userDao.selectAllUserByTrim(user);
    }

    public List<User> selectAllUserByWhere(User user){
        return userDao.selectAllUserByWhere(user);
    }

    public int updateUserBySet(User user){
        return userDao.updateUserBySet(user);
    }

    public List<User> selectUserByForeach(List list){
        return userDao.selectUserByForeach(list);
    }

    public List<User> selectUserByBind(User user){
        return userDao.selectUserByBind(user);
    }

}
