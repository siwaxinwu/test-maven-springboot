package com.roy.configuration;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * description： springboot中hibernate validator和AOP的联合使用
 * author：dingyawu
 * date：created in 0:40 2020/8/23
 * history:
 */
@Configuration
public class ValidatorConfiguration {
    @Bean
    public Validator getvalidatorFactory(){
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory();
        return validatorFactory.getValidator();
    }
}
