package com.roy.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.ConstraintViolation;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * description：
 * author：dingyawu
 * date：created in 18:38 2020/8/22
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListValidException extends RuntimeException{
    private Map<Integer,Set<ConstraintViolation<Object>> > errors;

}
