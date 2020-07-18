package com.albg.consumer.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/18 21:14
 * @Description:
 */
@Component
public class MyLoadBalance implements ILoadBalance {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance getInstant(List<ServiceInstance> serviceInstances) {

        if (CollectionUtils.isEmpty(serviceInstances)) {
            return null;
        }

        int requestNumber = getAndIncrement();

        int serviceCount = serviceInstances.size();

        int realServiceIndex = requestNumber % serviceCount;

        return serviceInstances.get(realServiceIndex);
    }

    /**
     * request number
     * @return int
     */
    private int getAndIncrement() {

        int current;
        int next;

        for (; ; ) {
            current = atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
            if (atomicInteger.compareAndSet(current, next)) {
                System.out.println("=====第" + next + "请求====");
                return next;
            }
        }

    }

}
