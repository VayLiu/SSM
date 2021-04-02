package com.vayliu.aop.service;

import com.vayliu.aop.dao.XmlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service层 接口实现类
 *
 * @author: VayLiu
 **/

@Service("xmlService")
public class XmlServiceImpl implements XmlService {

    @Autowired
    private XmlDao xmlDao;

    @Override
    public int save(String sql, Object[] param) {
        return xmlDao.save(sql, param);
    }

    @Override
    public int delete(String sql, Object[] param) {
        return xmlDao.delete(sql, param);
    }
}
