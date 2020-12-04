package com;



import com.roy.strategytest.EntStrategyHolder;
import com.roy.strategytest.EntStrategyHolderUpdate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
@ServletComponentScan
public class APP {
    public static void main(String[] args) {
        SpringApplication.run(APP.class, args);
    }

}
