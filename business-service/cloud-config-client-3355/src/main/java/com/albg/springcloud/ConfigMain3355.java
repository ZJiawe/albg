package com.albg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/23 20:57
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigMain3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3355.class, args);
    }

}
