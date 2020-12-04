package com.roy.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * description：
 * author：dingyawu
 * date：created in 11:02 2020/7/25
 * history:
 */
public class testImport {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestDemo.class);
        String[] names = ac.getBeanDefinitionNames();
        Arrays.asList(names).stream().forEach(System.out::println);
    }
}
