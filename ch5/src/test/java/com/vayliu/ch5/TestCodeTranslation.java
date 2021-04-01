package com.vayliu.ch5;

import com.vayliu.ch5.dao.CodeTransactionDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * CodeTranslationDao的测试类
 *
 * @author: VayLiu
 **/


public class TestCodeTranslation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ch5ApplicationContext.xml");
        CodeTransactionDao codeTransactionDao = (CodeTransactionDao) applicationContext.getBean("codeTransactionDao");
        String result = codeTransactionDao.test();
        System.out.println(result);
    }
}
