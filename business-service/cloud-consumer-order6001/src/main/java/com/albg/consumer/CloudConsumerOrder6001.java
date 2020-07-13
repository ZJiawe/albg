package com.albg.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/13 22:38
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerOrder6001 {
    public static void main(String[] args) {
        {
            SpringApplication.run(CloudConsumerOrder6001.class, args);
        }
    }
}
