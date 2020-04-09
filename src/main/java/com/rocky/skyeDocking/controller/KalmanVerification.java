package com.rocky.skyeDocking.controller;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.rocky.skyeDocking.model.RechargeReq;

import static com.rocky.skyeDocking.utils.SnowflakeIdWorker.generateCurrentDate;


/**
 * @Description: 卡密验证
 * @Author Baizhen
 * @Date 2020/4/7 14:58
 */
public class KalmanVerification {

    public static void main(String[] args) {
        String strUrl = "http://charge.51mrp.com/member-sell-plat/member/cardSell.do";

        String strMerchantOrderId = generateCurrentDate();

        RechargeReq rechargeReq = RechargeReq.builder()
                .merchantId("23686")
                .chargeAccount("")
                .merchantProductCode("KMceshi")
                .phone("")
                .merchantOrderId(strMerchantOrderId)
                .merchantNotifyUrl("http://190gs90623.iok.la/notify/handleNotify")
                .build();

        String strJSON = JSON.toJSONString(rechargeReq);
        String result = HttpUtil.post(strUrl, strJSON);
        System.out.println(result);

    }
}
