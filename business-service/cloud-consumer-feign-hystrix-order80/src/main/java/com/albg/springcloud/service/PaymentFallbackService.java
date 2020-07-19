package com.albg.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-20 18:22
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
//    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
//            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
//    })
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
