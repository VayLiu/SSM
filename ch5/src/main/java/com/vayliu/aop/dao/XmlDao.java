package com.vayliu.aop.dao;

/**
 *
 *
 * @author: VayLiu
 **/


public interface XmlDao {
    public int save(String sql, Object[] param);
    public int delete(String sql, Object[] param);
}
