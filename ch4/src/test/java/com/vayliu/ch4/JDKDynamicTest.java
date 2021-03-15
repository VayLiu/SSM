package com.vayliu.ch4;

import com.vayliu.dynamic.jdk.JDKDynamicProxy;
import com.vayliu.dynamic.jdk.TestDao;
import com.vayliu.dynamic.jdk.TestDaoImpl;

/**
 * JDK动态代理
 *
 * @author: VayLiu
 **/


public class JDKDynamicTest {

    public static void main(String[] args) {

        // 创建代理对象
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        // 创建目标对象
        TestDao testDao = new TestDaoImpl();
        // 从代理对象汇总获取增强后的目标对象，返回的对象是被代理后的对象，他会进入代理的逻辑方法 invoke 中
        TestDao testDaoAdvice = (TestDao) jdkDynamicProxy.createProxy(testDao);
        // 执行方法
        testDaoAdvice.save();
        System.out.println("===========");
        testDaoAdvice.modify();
        System.out.println("===========");
        testDaoAdvice.delete();
    }

}
