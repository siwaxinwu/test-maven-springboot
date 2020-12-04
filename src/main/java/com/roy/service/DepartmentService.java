package com.roy.service;

import com.roy.entity.Department;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * description：
 * author：dingyawu
 * date：created in 21:27 2020/8/21
 * history:
 */
@Service
@Validated
public class DepartmentService {
    public void add(@Valid Department dept){
        System.out.println("department add ok");
    }
}
