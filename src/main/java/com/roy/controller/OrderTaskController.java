package com.roy.controller;

import com.roy.service.OrderTaskServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderTaskController {
    @Autowired
    private OrderTaskServic orderTaskServic;

    @RequestMapping("/cancel")
    public String cancelOrder() throws InterruptedException {
        return orderTaskServic.ordertask();
    }
}
