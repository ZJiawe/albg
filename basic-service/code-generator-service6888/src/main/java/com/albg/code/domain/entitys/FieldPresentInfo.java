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
 * 当前字段信息记录表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FieldPresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 字段主键
     */
    private String fieldId;

    /**
     * 数据库主键
     */
    private String databaseId;

    /**
     * 表主键
     */
    private String tableId;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段类型
     */
    private String typeValue;

    /**
     * 字段长度
     */
    private String sizeValue;

    /**
     * 是否为主键
     */
    private Integer primaryKey;

    /**
     * 是否允许为空：0不允许为空，1允许为空
     */
    private Integer nullValue;

    /**
     * 是否自增
     */
    private Integer autoIncrement;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 字段说明
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
     * hibernate乐观锁使用
     */
    @Version
    private Integer version;


}
