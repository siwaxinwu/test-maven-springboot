package com.roy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * description：
 * author：dingyawu
 * date：created in 20:17 2020/8/21
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    @Null(groups = {Add.class}) //添加的时候
    @NotNull(groups = {Update.class}) //修改的时候
    private Integer id;
    @NotEmpty
    private String name;
    @Valid
    private Department dept;

    public interface Add{


    }

    public interface Update{

    }

}
