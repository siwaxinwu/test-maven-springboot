package com.roy.service;

import com.roy.entity.Emp;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * description：
 * author：dingyawu
 * date：created in 21:22 2020/8/21
 * history:
 */
public interface IEmpService {
    public void add(@Valid @NotNull Emp emp);

    public @NotNull  Emp getById(@NotNull Integer id);
}
