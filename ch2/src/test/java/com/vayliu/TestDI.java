package com.vayliu;


import com.vayliu.service.TestDIService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDI {
    public static void main(String[] args) {
        // 1 初始化 Spring 容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2 app 获取配置文件中的所管理的 类实例
        TestDIService testDIService = (TestDIService) app.getBean("testDIService");
        testDIService.sayHello();

        TestDIService testDIService1 = (TestDIService) app.getBean("testDIService1");
        testDIService1.sayHello();
    }
}
