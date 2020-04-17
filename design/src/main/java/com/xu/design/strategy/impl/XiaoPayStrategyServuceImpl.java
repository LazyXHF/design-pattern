package com.xu.design.strategy.impl;

import com.xu.design.strategy.StrategyService;
import org.springframework.stereotype.Service;

/***
 *@Title
 *@Author 许小桀
 *@Date 2020/4/17 9:42
 **/
@Service
public class XiaoPayStrategyServuceImpl implements StrategyService {

    @Override
    public String toPay() {
        return "小米支付";
    }
}
