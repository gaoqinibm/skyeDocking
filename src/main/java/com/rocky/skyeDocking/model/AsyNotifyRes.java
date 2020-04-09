package com.rocky.skyeDocking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 卡密结果异步通知
 * @Author Baizhen
 * @Date 2020/4/7 15:35
 */
@Data
@Builder
@AllArgsConstructor
public class AsyNotifyRes implements Serializable {

    private static final long serialVersionUID = 6156141355584041096L;

    //充值状态，3：表示提交成功, 等待回调 其他：表示失败
    private Integer status;

    //错误信息，一般充值失败才有描述
    private String errMsg;

    //错误信息，一般充值失败才有描述
    private String merchantOrderId;

    //斯凯定义生成的订单流水号，为空的情况：订单参数有问题或者系统故障
    private String skyOrderId;

    //List对象
    private List<Kalman> cardList;

    class Kalman{
        private String cardNo; //卡号
        private String cardPassword; //密码
        private String expireTime; //有效时间 2020-06-01
    }
}
