package com.albg.code.domain.entitys;

import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 历史表信息记录表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TableHisInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 表历史信息表主键
     */
    private String infoId;

    /**
     * 版本主键
     */
    private String versionId;

    /**
     * 数据库主键
     */
    private String databaseId;

    /**
     * 表主键
     */
    private String tableId;

    /**
     * 表名称
     */
    private String name;

    /**
     * 表编码
     */
    private String code;

    /**
     * 表引擎
     */
    private String engine;

    /**
     * 表说明
     */
    private String note;

    /**
     * 操作
     */
    private String action;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Timestamp modificationTime;

    /**
     * hibernate乐观锁使用
     */
    @Version
    private Integer version;


}
