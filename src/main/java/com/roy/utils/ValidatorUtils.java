package com.roy.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Validator;

/**
 * description：
 * author：dingyawu
 * date：created in 17:35 2020/8/22
 * history:
 */
@Component
public class ValidatorUtils {

    public static Validator validator;

    @Autowired
    public void setValidator(Validator validator){
        ValidatorUtils.validator = validator;
    }




}
