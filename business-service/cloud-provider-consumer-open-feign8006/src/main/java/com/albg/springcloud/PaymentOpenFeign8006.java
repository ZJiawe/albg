package com.albg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/19 16:05
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class PaymentOpenFeign8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentOpenFeign8006.class, args);
    }
}
