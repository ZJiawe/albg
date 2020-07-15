package com.albg.provider.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/12 21:12
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8001 {

    /**
     * springBoot启动类
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001.class, args);
    }

}
