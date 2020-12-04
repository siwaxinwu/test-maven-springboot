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
public class SuperVipPayService implements UserPayService , InitializingBean {

    @Override
    public BigDecimal quote(BigDecimal orderPrice) {
        return new BigDecimal("0.8").multiply(orderPrice);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("SuperVip",this);
    }
}

