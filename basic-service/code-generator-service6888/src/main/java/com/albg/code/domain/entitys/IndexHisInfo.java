package com.albg.code.domain.entitys;

import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 历史索引信息记录表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IndexHisInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 索引历史信息表主键
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
     * 索引主键
     */
    private String indexId;

    /**
     * 索引名称
     */
    private String name;

    /**
     * 索引类型
     */
    private Integer typeValue;

    /**
     * 索引说明
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
