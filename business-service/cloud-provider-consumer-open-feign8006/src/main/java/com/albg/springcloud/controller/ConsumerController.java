package com.albg.springcloud.controller;

import com.albg.common.dto.CommonResult;
import com.albg.common.dto.Payment;
import com.albg.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/19 16:09
 * @Description:
 */
@RestController
public class ConsumerController {

    @Resource
    PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

}
