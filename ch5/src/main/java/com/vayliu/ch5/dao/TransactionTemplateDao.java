package com.vayliu.ch5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 基于 TranslationTemplate 的编程式事务管理 Dao层
 *
 * @author: VayLiu
 **/

@Repository("transactionTemplateDao")
public class TransactionTemplateDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private TransactionTemplate transactionTemplate;

    String message = "";

    public String test() {
        // 以匿名内部类的方式实现 TransactionCallback 接口，使用默认的事务提交和回滚规则，在业务代码中不需要显式调用任何事务处理API
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus arg0) {
                String sql = "delete from t_user";
                String sql1 = "insert into t_user values(?,?,?)";
                Object[] param = {1, "Vay", 1500};
                try {
                    jdbcTemplate.update(sql);
                    jdbcTemplate.update(sql1, param);
                    //jdbcTemplate.update(sql1, param);
                    message = "执行成功，没有事务回滚";
                } catch (Exception e) {
                    message = "主键重复，事务回滚";
                    e.printStackTrace();
                }
                return message;
            }
        });
        return message;
    }

}
