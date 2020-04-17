package com.xu.design.entity;

import lombok.Data;

/***
 *@Title
 *@Author 许小桀
 *@Date 2020/4/17 9:21
 **/
@Data
public class PaymentChannelEntity {
    /** ID */
    private Integer id;
    /** 渠道名称 */
    private String channelName;
    /** 渠道ID */
    private String channelId;
    /**
     * 策略执行beanId
     */
    private String strategyBeanId;


}

