package com.roy.strategytest;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EntBStrategy implements EntStrategy {
    @Override
    public String getStuff() {
        return "ent B";
    }

    @Override
    public void send() {
        System.out.println("send b");
    }

}
