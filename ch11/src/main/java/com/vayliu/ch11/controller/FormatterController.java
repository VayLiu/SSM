package com.vayliu.ch11.controller;

import com.vayliu.ch11.pojo.GoodsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: VayLiu
 **/

@Controller
@RequestMapping("/my")
public class FormatterController {

    @RequestMapping("/formatter")
    public String myConverter(GoodsModel goodsModel, Model model) {
        model.addAttribute("goods", goodsModel);
        return "showGoods";
    }

}
