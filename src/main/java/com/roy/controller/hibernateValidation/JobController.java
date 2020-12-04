package com.roy.controller.hibernateValidation;


import com.roy.entity.Emp;
import com.roy.entity.Job;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.groups.Default;
import javax.xml.transform.Result;

/**
 * description：
 * author：dingyawu
 * date：created in 23:25 2020/8/21
 * history:
 */
@RestController
@RequestMapping("/job")
@Validated
public class JobController {
    @PostMapping("/add")
    public ResultVO add(@RequestBody @Valid Job job){
        /*iEmpService.add(emp);*/
        return ResultVO.success();
    }
}
