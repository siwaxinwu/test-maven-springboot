package com.roy.service.impl;

import com.roy.entity.Emp;
import com.roy.service.IEmpService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * description：
 * author：dingyawu
 * date：created in 21:25 2020/8/21
 * history:
 */
@Service
@Validated
public class EmpServiceImpl implements IEmpService {
    @Override
    public void add( Emp emp) {
        System.out.println("emp add ok");

    }

    @Override
    public @NotNull Emp getById(@NotNull Integer id) {
        return null;
    }
}
