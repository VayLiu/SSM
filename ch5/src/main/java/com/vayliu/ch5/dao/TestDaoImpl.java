package com.vayliu.ch5.dao;

import com.vayliu.ch5.pojo.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TestDao接口实现类
 *
 * @author: VayLiu
 **/

@Repository("testDao")
public class TestDaoImpl implements TestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 更新方法，包括添加、修改、删除
     * @param sql SQL语句
     * @param param 参数
     * @return 更新行数
     */
    @Override
    public int update(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }

    /**
     * 查询方法
     * @param sql SQL语句
     * @param param 参数
     * @return MyUser列表
     */
    @Override
    public List<MyUser> query(String sql, Object[] param) {
        RowMapper<MyUser> rowMapper = new BeanPropertyRowMapper<MyUser>(MyUser.class);
        return jdbcTemplate.query(sql, rowMapper, param);
    }
}
