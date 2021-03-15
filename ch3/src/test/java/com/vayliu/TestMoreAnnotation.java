package com.vayliu;

import com.vayliu.annotation.test.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试dao,service,controller层的相关注解
 *
 * @author: VayLiu
 **/


public class TestMoreAnnotation {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("annotationContext.xml");
        TestController testController = (TestController) app.getBean("testController");
        testController.save();
    }
}
