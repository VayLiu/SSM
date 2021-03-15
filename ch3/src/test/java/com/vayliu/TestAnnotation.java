package com.vayliu;

import com.vayliu.annotation.AnnotationUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于注解的依赖注入测试类
 *
 * @author: VayLiu
 **/


public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("annotationContext.xml");
        AnnotationUser annotationUser = (AnnotationUser) app.getBean("annotationUser");
        System.out.println(annotationUser.getName());
    }
}
