package com.xu.design.mapper;

import com.xu.design.entity.PaymentChannelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/***
 *@Title
 *@Author 许小桀
 *@Date 2020/4/17 9:28
 **/
@Mapper
public interface PaymentChannelMapper {
    @Select("SELECT  id as id ,CHANNEL_NAME as CHANNELNAME ,CHANNEL_ID as CHANNELID,strategy_bean_id AS strategybeanid FROM payment_channel where CHANNEL_ID=#{payCode}")
    public PaymentChannelEntity getPaymentChannel(String payCode);

}
