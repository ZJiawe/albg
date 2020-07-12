package com.albg.code.interfaces.controller;


import com.albg.code.domain.entitys.DbPresentInfo;
import com.albg.code.domain.service.interfaces.DbPresentInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 当前数据库信息记录表 前端控制器
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@RestController
@RequestMapping("/dbPresentInfo")
public class DbPresentInfoController {

    @Resource
    DbPresentInfoService dbPresentInfoService;

    @GetMapping(value = "{id}")
    public DbPresentInfo searchById(@PathVariable(value = "id") String id) {
        return dbPresentInfoService.getById(id);
    }

}

