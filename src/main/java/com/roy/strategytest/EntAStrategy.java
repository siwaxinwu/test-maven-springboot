package com.roy.strategytest;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EntAStrategy implements EntStrategy {
    @Override
    public String getStuff() {
        return "ent A";
    }

    @Override
    public void send() {
        System.out.println("send a");
    }
}
