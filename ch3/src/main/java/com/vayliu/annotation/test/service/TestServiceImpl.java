package com.vayliu.annotation.test.service;

import com.vayliu.annotation.test.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * service 层的实现类
 *
 * @author: VayLiu
 **/

@Service("testService")
public class TestServiceImpl implements TestService{

//    @Autowired
    @Resource(name = "testDao")
    private TestDao testDao;

    @Override
    public void save() {
        testDao.save();
        System.out.println("Service层保存");
    }
}
