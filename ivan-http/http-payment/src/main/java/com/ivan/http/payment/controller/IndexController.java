package com.ivan.http.payment.controller;

import com.ivan.common.api.payment.service.PayChannelService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @DubboReference
    private PayChannelService payChannelService;

    @RequestMapping("index")
    public String index(){
        return payChannelService.test();
    }

}
