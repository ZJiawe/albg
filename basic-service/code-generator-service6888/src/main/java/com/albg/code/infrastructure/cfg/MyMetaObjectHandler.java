package com.albg.code.infrastructure.cfg;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author : MrZheng
 * @Date: 2020/7/12 18:11
 * @Description:
 */
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 自动填充字段 version:版本控制默认为0，逻辑删除 status 状态为 1
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        // 版本号3.0.6以及之前的版本
        this.setFieldValByName("version", 0, metaObject);
        // 版本号3.0.6以及之前的版本
        this.setFieldValByName("active", 1, metaObject);
        // @since 快照：3.0.7.2-SNAPSHOT， @since 正式版暂未发布3.0.7
        // this.setInsertFieldValByName("operator", "Jerry", metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        // this.setFieldValByName("operator", "Tom", metaObject);
        // this.setUpdateFieldValByName("operator", "Tom", metaObject);//@since 快照：3.0.7.2-SNAPSHOT， @since 正式版暂未发布3.0.7
    }
}
