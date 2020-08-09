package com.albg.springcloud.myhandle;

import com.albg.common.dto.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;


/**
 * @auther zzyy
 * @create 2020-02-25 15:32
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
