package com.albg.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/15 21:46
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
            SpringApplication.run(EurekaMain7001.class, args);
    }

}
