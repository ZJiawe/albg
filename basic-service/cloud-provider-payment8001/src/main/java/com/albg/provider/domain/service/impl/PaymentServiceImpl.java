package com.albg.provider.domain.service.impl;

import com.albg.provider.domain.entitys.Payment;
import com.albg.provider.domain.mapper.PaymentMapper;
import com.albg.provider.domain.service.interfaces.PaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

}
