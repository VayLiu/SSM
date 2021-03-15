package com.vayliu.annotation.test.dao;

import org.springframework.stereotype.Repository;

/**
 * dao 层接口实现类
 *
 * @author: VayLiu
 **/

@Repository("testDao")
public class TestDaoImpl implements TestDao{

    @Override
    public void save() {
        System.out.println("Dao层保存");
    }

}
