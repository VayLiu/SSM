package com.vayliu;

import com.vayliu.instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstance {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanClass b1 = (BeanClass) app.getBean("beanInstance");
        System.out.println(b1 + "\n" + b1.message);

        BeanClass b2 = (BeanClass) app.getBean("staticFactoryInstance");
        System.out.println(b2 + "\n" + b2.message);

        BeanClass b3 = (BeanClass) app.getBean("instanceFactoryInstance");
        System.out.println(b3 + "\n" + b3.message);
    }

}