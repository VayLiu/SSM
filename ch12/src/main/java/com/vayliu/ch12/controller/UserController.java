package com.vayliu.ch12.controller;

import com.vayliu.ch12.pojo.User;
import com.vayliu.ch12.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

/**
 * @author: VayLiu
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Log logger = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/input")
    public String inputUser(Model model) {
        HashMap<String, String> hobbys = new HashMap<String, String>();
        hobbys.put("篮球", "篮球");
        hobbys.put("乒乓球", "乒乓球");
        hobbys.put("电玩", "电玩");
        hobbys.put("游泳", "游泳");
        model.addAttribute("user", new User());
        model.addAttribute("hobbys", hobbys);
        model.addAttribute("careers", new String[] {"教师", "学生", "coding 搬运工", "IT民工", "其他"});
        model.addAttribute("houseRegisters", new String[] {"北京", "上海", "广州", "深圳", "其他"});
        return "userAdd";
    }

    @RequestMapping(value = "save")
    public String addUser(@ModelAttribute User user, Model model) {
        if (userService. addUser(user)) {
            logger.info ("成功");
            return "redirect:/user/list";
        } else {
            logger.info("失败");
            HashMap<String, String> hobbys = new HashMap<String, String>();
            hobbys.put("篮球", "篮球");
            hobbys.put("乒乓球", "乒乓球");
            hobbys.put("电玩", "电玩");
            hobbys.put("游泳", "游泳");
            model.addAttribute(" hobbys", hobbys);
            model.addAttribute("careers", new String[]{"教师", "学生", "coding搬运工", "民工", "其他"});
            model.addAttribute("houseRegisters", new String[]{"北京", "上海", " 广州", "深圳", "其他"});
            return "userAdd";
        }
    }

    @RequestMapping(value = "/list")
    public String listUsers(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "userList";
    }

}
