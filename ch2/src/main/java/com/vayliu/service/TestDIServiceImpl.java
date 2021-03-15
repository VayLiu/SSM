package com.vayliu.service;

import com.vayliu.dao.TestDIDao;

/**
 * 使用构造方法注入
 *
 * @author: VayLiu
 **/


public class TestDIServiceImpl implements TestDIService {

    private TestDIDao testDIDao;

    // 构造方法，用于实现依赖注入接口对象 testDIDao
    public TestDIServiceImpl(TestDIDao testDIDao) {
        super();
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        testDIDao.sayHello();
        System.out.println("TestDIService 构造方法注入 say: Hello, Study hard!");
    }
}
