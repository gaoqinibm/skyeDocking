package com.rocky.skyeDocking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 充值请求
 * @Author Baizhen
 * @Date 2020/4/7 15:19
 */
@Data
@Builder
@AllArgsConstructor
public class RechargeReq implements Serializable {

    private static final long serialVersionUID = 1761241008530109189L;

    //商户号，由斯凯分配
    private String merchantId;

    //充值账号
    private String chargeAccount;

    //产品编码
    private String merchantProductCode;

    //产品编码
    private String phone;

    //自定义定订单号，格式要求：yyyyMMdd****
    private String merchantOrderId;

    //数据同步地址(如果传入，优先该地址同步)
    private String merchantNotifyUrl;

    //数据同步地址(如果传入，优先该地址同步)
    private String ip;
}
