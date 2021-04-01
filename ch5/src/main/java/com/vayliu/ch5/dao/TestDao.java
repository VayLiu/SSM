package com.vayliu.ch5.dao;

import com.vayliu.ch5.pojo.MyUser;

import java.util.List;

public interface TestDao {
    public int update(String sql, Object[] param);
    public List<MyUser> query(String sql, Object[] param);
}
