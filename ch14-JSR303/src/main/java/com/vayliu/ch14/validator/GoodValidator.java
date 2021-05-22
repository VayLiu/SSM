package com.vayliu.ch14.validator;

import com.vayliu.ch14.pojo.Good;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Date;

/**
 * 验证器类
 *
 * @author: VayLiu
 **/

@Component
public class GoodValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Good.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {

        Good good = (Good) o;

        ValidationUtils.rejectIfEmpty(errors, "name", "good.name.required");
        ValidationUtils.rejectIfEmpty(errors, "description", "good.description.required");

        if (good.getPrice() > 100 || good.getPrice() < 0) {
            errors.rejectValue("price", "price.invalid");
        }

        Date createDate = good.getDate();
        if (createDate != null && createDate.after(new Date())) {
            errors.rejectValue("date", "date.invalid");
        }
    }
}
