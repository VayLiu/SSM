package com.vayliu.ch13.controller;

import com.vayliu.ch13.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author: VayLiu
 **/

@Controller
public class UserController {

    @RequestMapping("/toLogin")
    public String initLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
            session.setAttribute("user", user);
            return "redirect:main";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "login";
    }

    @RequestMapping("/main")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }

}
