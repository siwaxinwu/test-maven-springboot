package com.roy.entity;

import ch.qos.logback.core.read.ListAppender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;
import java.util.List;

/**
 * description：测试 hibernate validator
 * author：dingyawu
 * date：created in 21:43 2020/8/20
 * history:
 */

/**
 * if (null != dept.getId()){
 *             return "添加参数id异常";
 *         }
 *         if (dept.getParent_id() == null ) {
 *             return "添加参数parent_id异常";
 *         }
 *         if (dept.getParent_id() < 0) {
 *             return "添加参数parent_id异常，小于0";
 *         }
 *         if (dept.getName() == null) {
 *             return "添加参数name异常";
 *         }
 *         if (dept.getCreateTime()== null) {
 *             dept.setCreateTime(LocalDateTime.now());
 *         }else {
 *             if (dept.getCreateTime().isAfter(LocalDateTime.now())) {
 *                 return "添加参数createTime异常";
 *             }
 *         }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    /** 主键*/
    @Null(message = "主键必须没有值")
    private Integer id;
    /** 父级id*/
    @NotNull
    private Integer parentId;
    /** 部门名称*/
    @NotBlank
    private String name;
    /** 成立时间*/
    @PastOrPresent
    @NotNull
    private LocalDateTime createTime;

    private List<@Valid Emp> empList;

}
