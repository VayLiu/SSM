package com.vayliu.ch7.controller;

import com.vayliu.ch7.pojo.Person;
import com.vayliu.ch7.pojo.SelectPersonById;
import com.vayliu.ch7.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author: VayLiu
 **/

@Controller("personController")
public class PersonController {

    @Autowired
    private PersonService personService;

    public void selectPersonById1() {
        List<Person> personList = personService.selectPersonById1(1);
        System.out.println(personList);
    }

    public void selectPersonById2() {
        List<Person> personList = personService.selectPersonById2(1);
        System.out.println(personList);
    }

    public void selectPersonById3() {
        List<SelectPersonById> personList = personService.selectPersonById3(1);
        System.out.println(personList);
    }

}
