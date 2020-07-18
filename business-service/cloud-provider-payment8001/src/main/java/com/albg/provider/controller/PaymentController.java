package com.albg.provider.controller;

import com.albg.common.dto.CommonResult;
import com.albg.common.dto.Payment;
import com.albg.provider.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther zzyy
 * @create 2020-02-18 10:43
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,port: " + port, result);
        } else {
            return new CommonResult(444, "插入数据库失败,port: " + port, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            return new CommonResult(200, "查询成功,port: " + port, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id + ",port:" + port, null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public DiscoveryClient getDiscoveryClient() {
        List<String> service = discoveryClient.getServices();
        service.stream().forEach(log::info);

        discoveryClient.getInstances("cloud-payment-service").stream().forEach(serviceInstance ->
                log.info(serviceInstance.getHost() + "\t" + serviceInstance.getPort() + "\t" + serviceInstance.getInstanceId()));

        return discoveryClient;
    }

}
