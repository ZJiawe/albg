package com.albg.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/19 16:13
 * @Description:
 */
@Component
public class OpenfeignLogger {

    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }

}
