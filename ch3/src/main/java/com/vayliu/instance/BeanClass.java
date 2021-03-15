package com.vayliu.instance;

/**
 * 一个普通的类
 *
 * @author: VayLiu
 **/


public class BeanClass {

    public String message;

    // 普通类有无参构造
    public BeanClass() {
        message = "构造方法实例化Bean";
    }

    public BeanClass(String s) {
        message = s;
    }

}
