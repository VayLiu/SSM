package com.vayliu.ch5;

import com.vayliu.ch5.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 *
 * @author: VayLiu
 **/


public class TestSpringJDBC {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ch5ApplicationContext.xml");
        TestDao testDao = (TestDao) applicationContext.getBean("testDao");

        // 添加用户
        String sql = "insert into t_user values(null,?,?)";
        Object param[] = {"Vay", 1500};
        testDao.update(sql, param);

    }

}
