package com.vayliu.ch7;

import com.vayliu.ch7.controller.PersonController;
import com.vayliu.ch7.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: VayLiu
 **/


public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
//        userController.selectAllByMap();
//        userController.selectAllByJavaBean();
//        userController.selectAllUserByJavaBeanWithSql();
//        userController.selectAllUserReturnMap();
//        userController.selectAllUserByResultMap();

        PersonController personController = (PersonController) applicationContext.getBean("personController");
        personController.selectPersonById1();
        personController.selectPersonById2();
        personController.selectPersonById3();

    }
}
