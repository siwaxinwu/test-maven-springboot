package com.roy.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TranTest2Service {
    @Async("taskExecutor")
    @PostConstruct
    public void sendMsg1() throws InterruptedException {
        System.out.println("sendMsg1 begin");
        System.out.println(Thread.currentThread().getName() + "is running......");
        Thread.sleep(1000);
        System.out.println("sendMsg1 end");
    }
    @Async("taskExecutor")
    @PostConstruct
    public void sendMsg2() throws InterruptedException {
        System.out.println("sendMsg2 begin");
        System.out.println(Thread.currentThread().getName() + "is running......");
        Thread.sleep(1000);
        System.out.println("sendMsg2 end");
    }
}
