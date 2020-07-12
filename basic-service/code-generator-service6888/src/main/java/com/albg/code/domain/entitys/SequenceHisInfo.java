package com.albg.code.domain.entitys;

import java.sql.Timestamp;
import com.baomidou.mybatisplus.annotation.Version;
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
public class SequenceHisInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String versionId;

    private String infoId;

    private String databaseId;

    private String tableId;

    private String sequenceId;

    private String name;

    private String increament;

    private String start;

    private String maxValue;

    private String modifier;

    private String note;

    private String action;

    private Timestamp insertTime;

    private Timestamp updateTime;

    @Version
    private String version;


}
