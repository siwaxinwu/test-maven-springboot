package com.roy.strategytest;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class DefaultStrategy implements EntStrategy {

    @Override
    public String getStuff() {
        return "other ent";
    }

    @Override
    public void send() {
        System.out.println("send default....");
    }
}
