package com.vayliu.ch10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: VayLiu
 **/

@Controller
public class IndexController {

    @RequestMapping("/register")
    public String goRegister() {
        return "register";
    }

    @RequestMapping("/login")
    public String goLogin() {
        return "login";
    }

}
