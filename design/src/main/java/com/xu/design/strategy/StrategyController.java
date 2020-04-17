package com.xu.design.strategy;


import com.xu.design.entity.PaymentChannelEntity;
import com.xu.design.mapper.PaymentChannelMapper;
import com.xu.design.utils.SpringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/***
 *@Title
 *@Author 许小桀
 *@Date 2020/4/17 9:43
 **
 */
@RestController
public class StrategyController {
    @Autowired
    private SpringUtils springUtils;
    @Autowired
    private PaymentChannelMapper paymentChannelMapper;

    @RequestMapping("to-pay")
    public String toPay(@Param("id") String id) {
        PaymentChannelEntity paymentChannel = paymentChannelMapper.getPaymentChannel(id);
        StrategyService bean = springUtils.getBean(paymentChannel.getStrategyBeanId(), StrategyService.class);
        return bean.toPay();

    }
}
