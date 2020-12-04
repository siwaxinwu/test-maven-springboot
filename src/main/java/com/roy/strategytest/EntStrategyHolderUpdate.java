package com.roy.strategytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.Optional;

@Component
public class EntStrategyHolderUpdate {
    @Autowired
    private EntAlias entAlias;

    @Autowired
    private Map<String, EntStrategy> map;

    public EntStrategy getBy(String entNum){
        String name = Optional.ofNullable(entAlias.of(entNum)).orElse(EntAlias.DEFAULT_STRATEGY_NAME);
        EntStrategy entStrategy = Optional.ofNullable(map.get(name)).get();
        System.out.println(entStrategy);
        return entStrategy;
    }


}

