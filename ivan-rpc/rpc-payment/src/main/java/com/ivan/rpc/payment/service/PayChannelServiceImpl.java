package com.ivan.rpc.payment.service;

import com.ivan.common.api.payment.service.PayChannelService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class PayChannelServiceImpl implements PayChannelService {
    @Override
    public String test() {
        return "rpc-payment";
    }
}
