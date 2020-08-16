package com.albg.eureka;

import lombok.EqualsAndHashCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/15 21:50
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
@EqualsAndHashCode
public class Eureka7002Main {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Main.class, args);
    }

}
