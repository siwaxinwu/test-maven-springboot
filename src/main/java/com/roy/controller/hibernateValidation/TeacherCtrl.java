package com.roy.controller.hibernateValidation;

import com.roy.entity.Teacher;
import com.roy.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * description：
 * author：dingyawu
 * date：created in 23:17 2020/8/22
 * history:
 */
@RestController
@RequestMapping("/teacher")
@Validated
public class TeacherCtrl {
    @PutMapping("/update")
    public ResultVO update(@RequestBody @Valid Teacher teacher){
        return ResultVO.success();
    }
}
