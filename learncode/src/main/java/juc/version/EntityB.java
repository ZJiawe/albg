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
@Data
@Accessors(chain = true)
@EqualsAndHashCode(of = "bId")
public class EntityB implements IVersionControlEntity<EntityB> {

    private String bId;

    private String content;

    private EnumAction action;

    private Timestamp insertTime;

    @Override
    public String getDataId() {
        return bId;
    }

    @Override
    public EnumAction getDataAction() {
        return action;
    }

    @Override
    public EntityB setDataAction(EnumAction updateAction) {
        this.action = updateAction;
        return this;
    }

    @Override
    public Timestamp getRecordTime() {
        return insertTime;
    }

    @Override
    public Boolean isNotEqual(EntityB otherObject) {
        return !Objects.equals(content, otherObject.getContent());
    }


}
