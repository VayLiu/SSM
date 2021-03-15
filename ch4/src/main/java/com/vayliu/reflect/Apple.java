package com.vayliu.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 苹果类
 *
 * @author: VayLiu
 **/


public class Apple {

    public void eat() {
        System.out.println("Boss要吃苹果");
    }

    public void eat(String name) {
        System.out.println("Boss要吃" + name);
    }

    /**
     * 使用构造方法构建 Apple 类的实例（对象）
     */
    @Test
    public void testEat() {
        Apple apple = new Apple();
        apple.eat("苹果");
    }

    /**
     * 使用 Java反射 构建 Apple 类的实例（对象），并使用 Java反射 的方法调用 Apple 类中的方法
     */
    @Test
    public void testReflectInstance() {
        Apple apple = getInstance();
        ReflectMethod();
    }

    public static Apple getInstance() {
        Apple apple = null;
        try {
            apple = (Apple) Class.forName("com.vayliu.reflect.Apple").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return apple;
    }


    public Object ReflectMethod() {
        Object object = null;
        Apple target = new Apple();
        // 反射方法的对象
        Method method;
        try {
            method = Apple.class.getMethod("eat", String.class);
            object = method.invoke(target, "小苹果");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return object;
    }

}
