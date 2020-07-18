package com.albg.consumer.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/18 21:14
 * @Description:
 */
public interface ILoadBalance {

     ServiceInstance getInstant(List<ServiceInstance> serviceInstances);

}
