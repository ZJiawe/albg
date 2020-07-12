package com.albg.code.domain.entitys;

import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 版本记录表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VersionInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 版本主键
     */
    private String versionId;

    /**
     * 版本名称
     */
    private String name;

    /**
     * 版本说明
     */
    private String note;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Timestamp modificationTime;

    /**
     * 状态:有效,无效,伪删除
     */
    @TableLogic
    private Integer active;

    /**
     * 同一个应用，一个版本开放，其余关闭
     */
    private Integer status;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * hibernate乐观锁使用
     */
    @Version
    private Integer version;

    /**
     * 版本信息插入时间
     */
    private Timestamp insertTime;


}
