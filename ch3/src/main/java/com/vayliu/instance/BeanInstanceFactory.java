package com.vayliu.instance;

/**
 * 实例工厂实例化
 *
 * @author: VayLiu
 **/


public class BeanInstanceFactory {

    public BeanClass createBeanClassInstance() {
        return new BeanClass("调用实例工厂方法实例化 Bean");
    }

}
