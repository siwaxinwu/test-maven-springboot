package com.roy.controller.hibernateValidation;

import com.roy.enums.Error;
import com.roy.exception.ListValidException;
import com.roy.vo.ResultVO;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.validator.ValidatorException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.*;
import java.util.stream.Collectors;

/**
 * description：
 * author：dingyawu
 * date：created in 20:01 2020/8/21
 * history:
 */
@ControllerAdvice(basePackages = "com.roy.controller")
@ResponseBody
public class CtrlAdvice {
    @ExceptionHandler
    public ResultVO exceptionHandler(MethodArgumentNotValidException e){
        Map<String, String> collect = e.getBindingResult().getFieldErrors().stream().collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        return ResultVO.fail(Error.PARAM_ERROR, collect);
    }


    @ExceptionHandler
    public ResultVO exceptionHandler(ConstraintViolationException e){
        Map<Path, String> collect =
                e.getConstraintViolations().stream().collect(Collectors.toMap(ConstraintViolation::getPropertyPath, ConstraintViolation::getMessage));
        return ResultVO.fail(Error.PARAM_ERROR, collect);
    }

    @ExceptionHandler
    public ResultVO exceptionHandler(Exception e){
        return ResultVO.fail(Error.SYSO_ERROR, null);
    }

    @ExceptionHandler
    public ResultVO exceptionHandler(ValidatorException e){
        ListValidException cause = (ListValidException)e.getCause();
        Map<Integer, Map<Path, String>> map = new HashMap<>();
        Map<Integer, Set<ConstraintViolation<Object>>> errors = cause.getErrors();
        errors.forEach((integer, constraintViolations) -> {
            map.put(integer, constraintViolations.stream().
                    collect(Collectors.toMap(ConstraintViolation::getPropertyPath, ConstraintViolation::getMessage)));
        });
        return ResultVO.fail(Error.SYSO_ERROR, map);
    }
}
