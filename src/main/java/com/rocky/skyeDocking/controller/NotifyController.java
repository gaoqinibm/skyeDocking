package com.rocky.skyeDocking.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 卡密和权益异步通知controller
 * @Author Baizhen
 * @Date 2020/4/7 18:08
 */
@RestController
@Api(tags = "notifyController", description = "异步通知接口")
@RequestMapping("notify")
public class NotifyController {

    @PostMapping("handleNotify")
    @ApiOperation(value = "异步通知处理" ,  notes="异步通知处理")
    public String handleNotify(@RequestBody String notifyData){
        System.out.println("回调内容展示：" + notifyData);

        //TODO 解析status，若成功返回OK

        return "OK";
    }
}
