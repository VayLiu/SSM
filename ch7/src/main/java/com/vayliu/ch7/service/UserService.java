package com.vayliu.ch7.service;

import com.vayliu.ch7.dao.UserDao;
import com.vayliu.ch7.pojo.MapUser;
import com.vayliu.ch7.pojo.SelectPersonById;
import com.vayliu.ch7.pojo.SelectUserOrdersById;
import com.vayliu.ch7.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: VayLiu
 **/

@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> selectAllUserByMap(Map<String, Object> param){
        return userDao.selectAllUserByMap(param);
    }

    public List<User> selectAllUserByJavaBean(User user) {
        return userDao.selectAllUserByJavaBean(user);
    }

    public List<User> selectAllUserByJavaBeanWithSql(User user) {
        return userDao.selectAllUserByJavaBeanWithSql(user);
    }

    public List<Map<String, Object>> selectAllUserReturnMap() {
        return userDao.selectAllUserReturnMap();
    }

    public List<MapUser> selectAllUserByResultMap() {
        return userDao.selectAllUserByResultMap();
    }

    public List<User> selectUserOrdersById1(Integer uid) {
        return userDao.selectUserOrdersById1(uid);
    }

    public List<User> selectUserOrdersById2(Integer uid) {
        return userDao.selectUserOrdersById2(uid);
    }

    public List<SelectUserOrdersById> selectUserOrdersById3(Integer uid) {
        return userDao.selectUserOrdersById3(uid);
    }
}
