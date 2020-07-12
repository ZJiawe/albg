package com.albg.code.domain.entitys;

import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 当前数据库信息记录表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DbPresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 数据库主键
     */
    @TableId
    private String databaseId;

    /**
     * 数据库名称
     */
    private String name;

    /**
     * 数据库编码
     */
    private String code;

    /**
     * 排列字符集
     */
    private String collateValue;

    /**
     * 数据库说明
     */
    private String note;

    /**
     * 状态:有效,无效,伪删除
     */
    @TableLogic
    private Integer active;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Timestamp modificationTime;

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
     * 数据库类型：0->MYSQL,1->ORACAL, 2->SQLSERVER
     */
    private Integer type;


}
