package com.roy.controller.hibernateValidation;

import com.roy.entity.Emp;
import com.roy.entity.Employee;
import com.roy.service.IEmpService;
import com.roy.validation.ValidList;
import com.roy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import java.util.List;

/**
 * description：
 * author：dingyawu
 * date：created in 20:18 2020/8/21
 * history:
 */
@RestController
@RequestMapping("/emp")
@Validated
public class EmpController {

    /*@Autowired
    private IEmpService iEmpService;*/
    @PostMapping("/add")
    public ResultVO add(@RequestBody @Validated({Emp.Add.class, Default.class}) Emp emp){
        /*iEmpService.add(emp);*/
        return ResultVO.success();
    }
    @GetMapping("/getById")
    public ResultVO getById(@RequestBody @Min(10) Integer id){
        /*iEmpService.getById(id);*/
        return ResultVO.success();
    }

    @PutMapping("/update")
    public ResultVO update(@RequestBody @Validated({Emp.Update.class, Default.class}) Emp emp){
        return ResultVO.success();
    }

    @PostMapping("/list")
    public ResultVO addList(@RequestBody @ValidList(groupings = {Emp.Add.class, Default.class}, quickFail = true) List<Emp> employeeList){
        /*iEmpService.add(emp);*/
        return ResultVO.success();
    }
}
