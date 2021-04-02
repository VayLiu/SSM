package com.vayliu.ch5;

import com.vayliu.aop.controller.XmlController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于 XML方式 的声明式事务管理的测试类
 *
 * @author: VayLiu
 **/


public class XMLTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("XMLApplicationContext.xml");
        XmlController xmlController = (XmlController) applicationContext.getBean("xmlController");
        String result = xmlController.test();
        System.out.println(result);
    }
}
