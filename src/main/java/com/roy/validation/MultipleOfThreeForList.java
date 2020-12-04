package com.roy.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * description：
 * author：dingyawu
 * date：created in 14:38 2020/8/22
 * history:
 */
public class MultipleOfThreeForList implements ConstraintValidator<MultipleOfThree, List> {
    @Override
    public void initialize(MultipleOfThree constraintAnnotation) {

    }

    @Override
    //具体的验证逻辑
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        return null == list ? true : list.size() % 3 == 0;
    }
}
