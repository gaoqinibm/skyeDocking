package com.rocky.skyeDocking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 权益充值结果查询
 * @Author Baizhen
 * @Date 2020/4/7 15:52
 */
@Data
@Builder
@AllArgsConstructor
public class RechargeResultReq implements Serializable {

    private static final long serialVersionUID = -5873331583603726009L;

    //商户号，由斯凯分配
    private String merchantId;

    //必须与充值请求时用的merchantOrderId一致
    private String merchantOrderId;

}
