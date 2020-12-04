package com.roy.aop;

import com.roy.utils.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * description：
 * author：dingyawu
 * date：created in 0:44 2020/8/23
 * history:
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Aspect
public class ValidatorAspect {
    private Validator validator;

    @Pointcut("execution(* com.gwghk..*.web.*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        BaseResponse baseResponse = new BaseResponse();
        Object[] args = joinPoint.getArgs();
        for (Object arg : args){
            if(arg != null){
                Set<ConstraintViolation<Object>> constraintViolations = validator.validate(arg);
                if(constraintViolations.size() > 0){
                    /*baseResponse.setReturnCode(ReturnCode.CODE_1006);
                    for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
                        Path property = constraintViolation.getPropertyPath();
                        String name = property.iterator().next().getName();
                        baseResponse.setMessage("[" + name + "]" + constraintViolation.getMessage());
                        break;
                    }
                    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                    HttpServletResponse response = attributes.getResponse();
                    String responseStr = JsonUtil.objectToJson(baseResponse);
                    log.error(responseStr);
                    HttpResponseUtil.setResponseJsonBody(response,responseStr);*/
                    return null;
                }
            }
        }
        return joinPoint.proceed();
    }
}
