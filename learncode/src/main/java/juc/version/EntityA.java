package juc.version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Auther: MrZheng
 * @Date: 2020/8/16 17:16
 * @Description:
 */
@EqualsAndHashCode(of = "aId")
@Accessors(chain = true)
@Data
public class EntityA implements IVersionControlEntity<EntityA> {

    private String aId;

    private String content;

    private EnumAction action;

    private Timestamp insertTime;

    @Override
    public String getDataId() {
        return aId;
    }

    @Override
    public EnumAction getDataAction() {
        return action;
    }

    @Override
    public EntityA setDataAction(EnumAction updateAction) {
        this.action = updateAction;
        return this;
    }

    @Override
    public Timestamp getRecordTime() {
        return insertTime;
    }

    @Override
    public Boolean isNotEqual(EntityA otherObject) {
        return !Objects.equals(content, otherObject.getContent());
    }

}
