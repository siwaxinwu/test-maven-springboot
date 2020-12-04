package com.roy.strategy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * description：
 * author：dingyawu
 * date：created in 16:59 2020/12/1
 * history:
 */
@Service
public class ParticularlyVipPayService implements UserPayService, InitializingBean {

    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        if (new BigDecimal("30").compareTo(orderPrice) < 0) {
            return orderPrice.multiply(new BigDecimal("0.7"));
        }
        return orderPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("ParticularlyVip",this);
    }
}




