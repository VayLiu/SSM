package com.vayliu.ch7.controller;

import com.vayliu.ch7.pojo.Person;
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

    public void selectPersonById() {
        List<Person> personList = personService.selectPersonById(1);
        System.out.println(personList);
    }

}
