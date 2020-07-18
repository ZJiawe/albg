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
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class CloudConsumerOrder6002 {
    public static void main(String[] args) {
        {
            SpringApplication.run(CloudConsumerOrder6002.class, args);
        }
    }
}
