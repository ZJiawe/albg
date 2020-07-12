package com.albg.code.domain.entitys;

import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 当前索引字段联系表
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IndexFieldPresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 字段主键
     */
    private String fieldId;

    /**
     * 索引主键
     */
    private String indexId;

    /**
     * 字段长度
     */
    private Integer lengthValue;

    /**
     * 是否降序: 0为升序，1为降序
     */
    private Integer decline;

    /**
     * 索引字段位置
     */
    private Integer position;

    /**
     * hibernate乐观锁使用
     */
    @Version
    private Integer version;


}
