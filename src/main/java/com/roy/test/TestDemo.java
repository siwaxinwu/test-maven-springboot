package com.roy.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @Import的三种用法主要包括：
 * 1、直接填class数组方式
 * 2、ImportSelector方式【重点】
 * 3、ImportBeanDefinitionRegistrar方式
 * description：
 * author：dingyawu
 * date：created in 10:57 2020/7/25
 * history:
 */
@Import({TestDemo2.class, MyClass.class, MyClass2.class})
public class TestDemo {
    @Bean
    public AccountDao2 accountDao2(){
        return  new AccountDao2();
    }


}
