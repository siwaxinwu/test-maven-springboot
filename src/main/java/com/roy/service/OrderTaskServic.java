package com.roy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderTaskServic {
    @Autowired
    private TranTest2Service tranTest2Service;

    public String ordertask() throws InterruptedException {
        this.cancelOrder();
        tranTest2Service.sendMsg1();
        tranTest2Service.sendMsg2();
        return "ok";
    }

    public void cancelOrder(){
        System.out.println("cancel order begin");
        System.out.println("cancel order end");
    }
}
