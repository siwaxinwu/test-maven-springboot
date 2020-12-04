package com.roy.entity;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

@Configuration
@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "jack")
@Validated
@Data
public class Employee {


    @Size(min = 2, max = 23)
    private String name;

    @Value("${random.value}")
    private String string;

    @Value("${random.int[6,7]}")
    private Integer age;

    @Value("${random.int(10)}")
    private Integer height;



}
