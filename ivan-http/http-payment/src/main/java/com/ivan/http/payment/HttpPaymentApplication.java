package com.ivan.http.payment;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class HttpPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpPaymentApplication.class, args);
    }

}
