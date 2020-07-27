package com.albg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/12 21:12
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaProviderPayment9001 {

    /**
     * springBoot启动类
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaProviderPayment9001.class, args);
    }

}
