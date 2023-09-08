package com.ivan.rpc.payment;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubbo
public class RpcPaymentApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(RpcPaymentApplication.class, args);
        new CountDownLatch(1).await();
    }

}
