package com.roy.strategytest;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Map;

@Component
public class EntStrategyHolder {
    @Autowired
    private Map<String, EntStrategy> map;

    public EntStrategy getBy(String entNum){
        map.forEach((Key, value) ->{System.out.println(Key + "," + value.toString());});
        return map.get(entNum);
    }


}

