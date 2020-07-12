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
 * 
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SequencePresentInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * sequence_id
     */
    private String sequenceId;

    private String databaseId;

    private String tableId;

    private String name;

    private String increament;

    private String start;

    private String maxValue;

    private String modifier;

    private String note;

    @TableLogic
    private String active;

    private Timestamp insertTime;

    private Timestamp updateTime;

    @Version
    private Integer version;


}
