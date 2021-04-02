package com.vayliu.aop.service;

import com.vayliu.aop.dao.XmlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 *
 * @author: VayLiu
 **/

public interface XmlService {
    public int save(String sql, Object[] param);
    public int delete(String sql, Object[] param);
}
