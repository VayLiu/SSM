package com.vayliu.ch15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: VayLiu
 **/

@Controller
public class I18NTestController {

    @RequestMapping("/i18nTest")
    /**
     * locale 接受参数 locale值，并存储到 session 中
     */
    public String first() {
        return "first";
    }

}
