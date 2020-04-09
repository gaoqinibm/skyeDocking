package com.rocky.skyeDocking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 充值回应
 * @Author Baizhen
 * @Date 2020/4/7 15:28
 */
@Data
@Builder
@AllArgsConstructor
public class RechargeRes implements Serializable {

    private static final long serialVersionUID = -3102142542284762433L;

    //充值状态 0：表示充值成功 3：(权益充值)表示充值中 3：(卡密充值)表示提交成功, 等待回调  其他：表示失败
    private Integer status;

    //错误信息，一般充值失败才有描述
    private String errMsg;

    //回传CP订单号，为空的情况：订单参数有问题或者系统故障
    private String merchantOrderId;

    //斯凯定义生成的订单流水号，为空的情况：订单参数有问题或者系统故障
    private String skyOrderId;
}
