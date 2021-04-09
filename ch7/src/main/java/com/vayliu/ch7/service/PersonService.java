package com.vayliu.ch7.service;

import com.vayliu.ch7.dao.PersonDao;
import com.vayliu.ch7.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: VayLiu
 **/

@Service("personService")
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> selectPersonById(Integer param) {
        return personDao.selectPersonById(param);
    }
}
