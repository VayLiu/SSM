package com.vayliu.ch7.dao;

import com.vayliu.ch7.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PersonDao {
    List<Person> selectPersonById(Integer param);
}
