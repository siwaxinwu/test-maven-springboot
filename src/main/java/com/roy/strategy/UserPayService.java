package com.roy.strategy;

import java.math.BigDecimal;

/**
 * description：
 * author：dingyawu
 * date：created in 16:58 2020/12/1
 * history:
 */
public interface UserPayService {

    /**
     * 计算应付价格
     */
    public BigDecimal quote(BigDecimal orderPrice);
}