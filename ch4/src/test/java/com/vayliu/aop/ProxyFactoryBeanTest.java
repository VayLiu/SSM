package com.vayliu.aop;

import com.vayliu.dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * AOP测试类
 *
 * @author: VayLiu
 **/


public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("aopApplicationContext.xml");
        // 从容器中获取被增强之后的目标对象
        TestDao testDaoAdvice = (TestDao) app.getBean("testDaoProxy");
        // 执行方法
        testDaoAdvice.save();
        System.out.println("=========");
        testDaoAdvice.modify();
        System.out.println("=========");
        testDaoAdvice.delete();
    }
}
