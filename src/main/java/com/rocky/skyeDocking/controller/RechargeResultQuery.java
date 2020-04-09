package com.rocky.skyeDocking.controller;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.rocky.skyeDocking.model.RechargeResultReq;

/**
 * @Description: 主动发起查询充值结果
 * @Author Baizhen
 * @Date 2020/4/7 18:15
 */
public class RechargeResultQuery {

    public static void main(String[] args) {
        String strUrl = "http://charge.51mrp.com/member-sell-plat/member/query.do";

        RechargeResultReq rechargeResultReq = RechargeResultReq.builder()
                .merchantId("23686")
                .merchantOrderId("20200408697387164572319744") //必须与充值请求时用的merchantOrderId一致
                .build();

        String strJSON = JSON.toJSONString(rechargeResultReq);
        String result = HttpUtil.post(strUrl, strJSON);
        System.out.println(result);
    }
}
