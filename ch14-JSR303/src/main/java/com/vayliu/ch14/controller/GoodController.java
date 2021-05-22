package com.vayliu.ch14.controller;

import com.vayliu.ch14.pojo.Good;
import com.vayliu.ch14.service.GoodService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author: VayLiu
 **/

@Controller
@RequestMapping("/good")
public class GoodController {

    private static final Log logger = LogFactory.getLog(GoodController.class);

    @Autowired
    private GoodService goodService;

    @Resource
    private Validator validator;

    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("good", new Good());
        return "addGood";
    }

    @RequestMapping("/save")
    public String save(@Valid @ModelAttribute Good good, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addGood";
        }
        goodService.save(good);
        logger.info("添加成功");
        model.addAttribute("goodList", goodService.getGoods());
        return "goodList";
    }

}
