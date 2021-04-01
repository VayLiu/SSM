package com.vayliu.ch5;

import com.vayliu.ch5.dao.CodeTransactionDao;
import com.vayliu.ch5.dao.TransactionTemplateDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TransactionTemplateDao 的测试类
 *
 * @author: VayLiu
 **/


public class TestTranslationTemplateDao {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ch5ApplicationContext.xml");
        TransactionTemplateDao transactionTemplateDao= (TransactionTemplateDao) applicationContext.getBean("transactionTemplateDao");
        String result = transactionTemplateDao.test();
        System.out.println(result);
    }
}
