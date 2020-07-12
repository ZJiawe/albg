package com.albg.code.domain.entitys;

import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 初始数据当前表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OriginalDataPresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 初始数据主键
     */
    private String originalDataId;

    /**
     * 表主键(外键)
     */
    private String tableId;

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

    /**
     * 修改人
     */
    private String modifier;


}
