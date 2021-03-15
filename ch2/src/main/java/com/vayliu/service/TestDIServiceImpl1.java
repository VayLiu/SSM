package com.vayliu.service;

import com.vayliu.dao.TestDIDao;

/**
 * 使用属性的 setter 方法注入
 *
 * @author: VayLiu
 **/


public class TestDIServiceImpl1 implements TestDIService {

    private TestDIDao testDIDao;

    // 添加 TestDIDao 属性的 setter 方法，用于实现依赖注入
    public void setTestDIDao(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        // 调用 TestDIDao 中的 sayHello 方法
        testDIDao.sayHello();
        System.out.println("TestDIService setter 方法注入 say: Hello, Study hard!");
    }

}
