package com.roy.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

/**
 * description：
 * author：dingyawu
 * date：created in 14:14 2020/8/22
 * history:
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {MultipleOfThreeForInteger.class, MultipleOfThreeForList.class})
public @interface MultipleOfThree {
    String message() default "必须是3的倍数";

    Class<?>[] groups() default {};//必须写

    Class<? extends Payload>[] payload() default {};
}
