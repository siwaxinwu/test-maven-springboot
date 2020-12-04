package com.roy.controller;

import org.assertj.core.util.Lists;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static com.sun.deploy.perf.DeployPerfUtil.put;

public class SimpleIf{
    enum Type {
        APPLE("apple"),
        ORANGE("orange"),
        PEAR("pear"),
        OTHER("other");

        private final String type;

        Type(String type) {
            this.type = type;
        }

        public String getVal() {
            return type;
        }
    }

    private Map<Type, Consumer> register() {
        return new HashMap<Type, Consumer>() {{
            putIfAbsent(Type.PEAR, (str) -> { System.out.println("pear");});
            putIfAbsent(Type.ORANGE, (str) -> System.out.println("orange"));
            putIfAbsent(Type.APPLE, (str) -> System.out.println("apple"));
            putIfAbsent(Type.OTHER, (str) -> System.out.println("other"));
        }};
    }


    public void functionPrint(){
        Map<Type, Consumer> handlerMap = register();
        List<String> fruits = new ArrayList<String>(){{
            add("orange");add("pear");add("apple");add("other");
        }};
        // 获取随机的水果类型
        int index = (int) (Math.random() * 3);
        String type = fruits.get(index);
        System.out.println(type);
        handlerMap.get(Type.valueOf(type.toUpperCase())).accept(Type.valueOf(type.toUpperCase()));
    }

    public static void main(String[] args) {
        new SimpleIf().functionPrint();
    }
}


/**
 * 定义一个lambda 函数
 */
@FunctionalInterface
interface Handler {
    void handler();
}