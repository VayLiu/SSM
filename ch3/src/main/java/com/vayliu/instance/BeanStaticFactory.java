package com.vayliu.instance;

/**
 * 静态工厂实例化
 *
 * @author: VayLiu
 **/


public class BeanStaticFactory {

    private static BeanClass beanInstance = new BeanClass("调用静态方法实例化Bean");

    public static BeanClass createInstance() {
        return beanInstance;
    }

}
