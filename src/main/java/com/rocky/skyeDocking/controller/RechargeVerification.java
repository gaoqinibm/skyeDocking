package com.rocky.skyeDocking.controller;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.rocky.skyeDocking.model.RechargeReq;

import static com.rocky.skyeDocking.utils.SnowflakeIdWorker.generateCurrentDate;

/**
 * @Description: 充值验证
 * @Author Baizhen
 * @Date 2020/4/7 14:58
 */
public class RechargeVerification {

    public static void main(String[] args) {
        String strUrl = "http://member.51mrp.com/member-sell-plat/member/sell.do";

        String strMerchantOrderId = generateCurrentDate();

        RechargeReq rechargeReq = RechargeReq.builder()
                .merchantId("23686")
                .chargeAccount("110")
                .merchantProductCode("ceshi001")
                .phone("13634195169")
                .merchantOrderId(strMerchantOrderId)
                .merchantNotifyUrl("http://190gs90623.iok.la/notify/handleNotify")
                .ip("")
                .build();

        String strJSON = JSON.toJSONString(rechargeReq);
        String result = HttpUtil.post(strUrl, strJSON);
        System.out.println(result);
    }
}
