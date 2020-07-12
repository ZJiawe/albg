package com.albg.code.domain.entitys;

import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 字段值当前表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FieldValuePresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 字段值当前表主键
     */
    private String fieldValueId;

    /**
     * 初始数据主键(外键)
     */
    private String originalDataId;

    /**
     * 字段主键(外键)
     */
    private String fieldId;

    /**
     * 字段值
     */
    private String fieldValue;

    /**
     * 插入时间
     */
    private Timestamp insertTime;

    /**
     * 修改时间
     */
    private Timestamp updateTime;

    /**
     * 乐观锁
     */
    @Version
    private Integer version;


}
