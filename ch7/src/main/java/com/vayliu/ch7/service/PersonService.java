package com.vayliu.ch7.service;

import com.vayliu.ch7.dao.PersonDao;
import com.vayliu.ch7.pojo.Person;
import com.vayliu.ch7.pojo.SelectPersonById;
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

    public List<Person> selectPersonById1(Integer param) {
        return personDao.selectPersonById1(param);
    }

    public List<Person> selectPersonById2(Integer param) {
        return personDao.selectPersonById2(param);
    }

    public List<SelectPersonById> selectPersonById3(Integer param) {
        return personDao.selectPersonById3(param);
    }
}
