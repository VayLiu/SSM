package com.vayliu.ch5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * 数据访问层
 *
 * @author: VayLiu
 **/

@Repository("codeTransactionDao")
public class CodeTransactionDao {

    // 使用配置文件中的JDBC模板
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 事务管理器
    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    public String test() {
        // 默认事务定义，例如隔离级别，传播行为等
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        // 开启事务
        TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(transactionDefinition);
        String message = "执行成功，没有事务回滚";

        String sql = "delete from t_user";
        String sql1 = "insert into t_user values(?,?,?)";
        Object[] param = {1, "Vay", 1000};

        try {
            jdbcTemplate.update(sql);
            jdbcTemplate.update(sql1, param);
            //jdbcTemplate.update(sql1, param);
            dataSourceTransactionManager.commit(transactionStatus);
        } catch (Exception e) {
            dataSourceTransactionManager.rollback(transactionStatus);
            message = "主键重复，事务回滚";
            e.printStackTrace();
        }
        return message;
    }

}
