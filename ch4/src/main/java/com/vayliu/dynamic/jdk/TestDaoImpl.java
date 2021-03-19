package com.vayliu.dynamic.jdk;

import org.springframework.stereotype.Repository;

/**
 * 接口实现类
 *
 * @author: VayLiu
 **/

@Repository("testDao")
public class TestDaoImpl implements TestDao{

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void modify() {
        System.out.println("修改");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}
