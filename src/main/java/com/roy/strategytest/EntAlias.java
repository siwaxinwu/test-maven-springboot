package com.roy.strategytest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "ent")
@Data
public class EntAlias {
private HashMap<String, String> aliasMap;
    public static final String DEFAULT_STRATEGY_NAME = "defaultStrategy";

    public String of(String entNum){
        return aliasMap.get(entNum);
    }
}
