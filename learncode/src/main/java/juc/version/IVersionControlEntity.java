package juc.version;

import java.sql.Timestamp;
import java.util.Comparator;

/**
 * @Auther: MrZheng
 * @Date: 2020/8/16 17:17
 * @Description:
 */
public interface IVersionControlEntity<T> {

    /**
     * 业务ID
     * @return String
     */
    String getDataId();

    /**
     * 更改行为
     * @return EnumAction
     */
    EnumAction getDataAction();

    /**
     *
     * @param updateAction 修改行为
     * @return T 业务本身实体
     */
    T setDataAction(EnumAction updateAction);

    /**
     * 获取历史表记录时间
     * @return
     */
    Timestamp getRecordTime();

    /**
     * 判断是否相等
     * @param otherObject 比较的业务数据
     * @return Boolean
     */
    Boolean isNotEqual(T otherObject);

}
