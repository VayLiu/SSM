package com.vayliu.ch7.dao;

import com.vayliu.ch7.pojo.Idcard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IdcardDao {
    Idcard selectIdcardById(Integer param);
}
