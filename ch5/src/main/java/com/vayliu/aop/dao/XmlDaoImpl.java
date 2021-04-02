package com.vayliu.aop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Dao层 接口实现类
 *
 * @author: VayLiu
 **/

@Repository("xmlDao")
public class XmlDaoImpl implements XmlDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }

    @Override
    public int delete(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }
}
