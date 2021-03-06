package com.vayliu.aspectj;

import com.vayliu.dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aspect中jXML配置的测试类
 *
 * @author: VayLiu
 **/


public class XMLAspectJTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aspectjApplicationContext.xml");
        // 从容器中获取增强后的目标对象
        TestDao testDaoAdvice = (TestDao) applicationContext.getBean("testDao");
        // 执行方法
        testDaoAdvice.save();
    }

}
