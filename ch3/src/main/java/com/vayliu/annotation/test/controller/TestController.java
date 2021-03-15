package com.vayliu.annotation.test.controller;

import com.vayliu.annotation.test.service.TestService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Control 层
 *
 * @author: VayLiu
 **/

@Controller
public class TestController {

    @Resource(name = "testService")
    private TestService testService;

    public void save() {
        testService.save();
        System.out.println("Controller层保存");
    }

}
