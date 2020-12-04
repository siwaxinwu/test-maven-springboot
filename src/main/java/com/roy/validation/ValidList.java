package com.roy.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.groups.Default;
import java.lang.annotation.*;

/**
 * description：该注解用来校验list<T>中T的校验,支持list中的分组校验
 * author：dingyawu
 * date：created in 17:02 2020/8/22
 * history:
 */

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {ValidListForValidator.class})
public @interface ValidList {

    String message() default "";

    Class<?>[] groups() default {};//必须写

    Class<? extends Payload>[] payload() default {};

    /**
     * 要验证的分组
     * @return
     */
    Class<?>[] groupings() default {Default.class};

    boolean quickFail() default false;

}
