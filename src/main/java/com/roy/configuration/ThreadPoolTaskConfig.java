package com.roy.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ThreadPoolTaskConfig {

    @Bean
    public ThreadPoolTaskExecutor taskExecutor(){
        ThreadPoolTaskExecutor executer = new ThreadPoolTaskExecutor();
        executer.setCorePoolSize(20);
        executer.setMaxPoolSize(100);
        executer.setKeepAliveSeconds(10);
        executer.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executer.setThreadNamePrefix("Async_service_");
        executer.setQueueCapacity(200);
        executer.initialize();
        return  executer;
    }
}
