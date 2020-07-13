package com.albg.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/12 21:12
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.albg.provider.domain.mapper*")
public class CloudProviderPaymentApplication {

    /**
     * springBoot启动类
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentApplication.class, args);
    }

}
