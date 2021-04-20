package com.vayliu.ch8;

import com.vayliu.ch8.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: VayLiu
 **/


public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        System.out.println("================if");
        userController.selectAllUserByIf();
        System.out.println("================choose");
        userController.selectAllUserByChoose();
        System.out.println("================trim");
        userController.selectAllUserByTrim();
        System.out.println("================where");
        userController.selectAllUserByWhere();
        System.out.println("================set");
        userController.updateUserBySet();
        System.out.println("================foreach");
        userController.selectUserByForeach();
        System.out.println("================bind");
        userController.selectUserByBind();

    }
}
