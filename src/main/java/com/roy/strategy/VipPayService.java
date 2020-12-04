package com.roy.strategy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * description：
 * author：dingyawu
 * date：created in 17:00 2020/12/1
 * history:
 */
@Service
public class VipPayService implements UserPayService, InitializingBean {

    @Override
    public BigDecimal quote(BigDecimal orderPrice) {

        return new BigDecimal("0.9").multiply(orderPrice);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("Vip",this);
    }
}