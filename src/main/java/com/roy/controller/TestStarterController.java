package com.roy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description：
 * author：dingyawu
 * date：created in 8:02 2020/9/12
 * history:
 */
@RestController
public class TestStarterController {
    @GetMapping("testStarter")

    public String testStarter(){
        return "testStarter";
    }
}
