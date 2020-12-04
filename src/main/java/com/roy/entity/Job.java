package com.roy.entity;

import com.roy.validation.MultipleOfThree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * description：
 * author：dingyawu
 * date：created in 23:21 2020/8/21
 * history:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @MultipleOfThree
    private Integer id;
    @Size(min = 1,message = "{min}shfkl")
    @NotNull
    private String name;
    @Size(min = 1, max = 3)
    @NotNull
    @MultipleOfThree
    private List<String> labels;
}
