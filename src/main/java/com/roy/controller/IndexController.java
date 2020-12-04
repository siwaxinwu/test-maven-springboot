package com.roy.controller;

import com.roy.entity.Employee;
import com.roy.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
public class IndexController {

    private int num = 0;

    @Value("${name:roy}")
    private String name;

    @Autowired
    private Person person;

    @Autowired
    private Employee emp;

    @RequestMapping("/index")
    public String getIndex(){
        System.out.println(person.getEmail() + "," + person.getList() + "," + person.getMap() + "," + person.getName());
        System.out.println(name);
        return "ok";
    }

    @RequestMapping("/getEmp")
    public String getEmp(){
        System.out.println(emp.getName() + "," + emp.getString() + "," + emp.getAge() + "," + emp.getHeight());
        System.out.println(emp.getName() + "," + emp.getString() + "," + emp.getAge() + "," + emp.getHeight());
            return "emp";
    }

    @RequestMapping("/testScope")
    public void testScope(){
        System.out.println(++ num);
    }


}
