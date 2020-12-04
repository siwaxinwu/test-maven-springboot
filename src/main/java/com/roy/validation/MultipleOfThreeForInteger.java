package com.roy.validation;

import sun.awt.SunHints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * description：
 * author：dingyawu
 * date：created in 14:31 2020/8/22
 * history:
 */
public class MultipleOfThreeForInteger implements ConstraintValidator<MultipleOfThree,Integer> {
    @Override
    public void initialize(MultipleOfThree constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return value == null ? true : value % 3 == 0;
    }
}
