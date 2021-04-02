package com.vayliu.aop.controller;

import com.vayliu.aop.service.XmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller层
 *
 * @author: VayLiu
 **/

@Controller("xmlController")
public class XmlController {

    @Autowired
    private XmlService xmlService;

    public String test() {
        String message = "";
        String deleteSql = "delete from t_user";
        String saveSql = "insert into t_user value(?,?,?)";
        Object[] param = {2, "VayLiu", 2000};
        try {
            xmlService.delete(deleteSql, null);
            xmlService.save(saveSql, param);
            xmlService.save(saveSql, param);
        } catch (Exception e) {
            message = "主键重复，事务回滚";
            e.printStackTrace();
        }
        return message;
    }

}
