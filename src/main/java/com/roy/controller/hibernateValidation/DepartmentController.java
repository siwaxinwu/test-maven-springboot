package com.roy.controller.hibernateValidation;

import com.roy.entity.Department;
import com.roy.enums.Error;
import com.roy.service.DepartmentService;
import com.roy.vo.ResultVO;
import jdk.nashorn.internal.ir.SplitReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * description：
 * author：dingyawu
 * date：created in 21:41 2020/8/20
 * history:
 */
@RestController
@RequestMapping("/department")
//对本类的方法开启验证功能
@Validated
public class DepartmentController {
    /**
     * 部门添加
     * @param dept：id必须是null，parent_id不能为null，必须大于0，
     *            name不能为空（null或者“”）
     *            createTime 不是未来的时间
     * @return
     */
    /*@Autowired
    private DepartmentService departmentService;*/

    @PostMapping("/add")
    public ResultVO add(@RequestBody @Valid Department dept){
        Department build = Department.builder().id(1).createTime(null).build();
        /*departmentService.add(dept);*/
        return  ResultVO.success();
    }



}
