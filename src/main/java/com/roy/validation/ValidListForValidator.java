package com.roy.validation;

import com.roy.exception.ListValidException;
import com.roy.utils.ValidatorUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import javax.xml.bind.ValidationException;
import java.lang.annotation.Annotation;
import java.util.*;

/**
 * description：
 * author：dingyawu
 * date：created in 17:26 2020/8/22
 * history:
 */
public class ValidListForValidator implements ConstraintValidator<ValidList, List> {

    Class<?>[] groupings;
    boolean quickFail;
    @Override
    public void initialize(ValidList validList) {
        groupings = validList.groupings();
        quickFail = validList.quickFail();
    }

    @Override
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        Map<Integer, Set<ConstraintViolation<Object>>> errors = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            Set<ConstraintViolation<Object>> error = ValidatorUtils.validator.validate(obj, groupings);
            if (errors.size() > 0) {
                errors.put(i, error);
                if (quickFail){
                    throw new ListValidException(errors);
                }
            }
        }
        if (errors.size() > 0){
            throw new ListValidException(errors);
        }
        return true;
    }
}
