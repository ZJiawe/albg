package juc.version;

import cn.hutool.core.collection.CollUtil;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: MrZheng
 * @Date: 2020/8/16 20:52
 * @Description:
 */
public class EntityAService implements IVersionControl<EntityA> {

    /**
     * 这个方法采用模拟数据，具体实战需要从数据库中业务历史表获取数据
     * @param versionIdList 版本主键列表
     * @return List<EntityA>
     */
    @Override
    public List<EntityA> getAllVersionRecordData(List<String> versionIdList) {
        // 假设版本一返回值
        if (versionIdList.stream().findFirst().get().equals("v1")) {
            return CollUtil.newArrayList(
                    new EntityA().setAId("1").setContent("2").setAction(EnumAction.add).setInsertTime(Timestamp.from(Instant.now())),
                    new EntityA().setAId("2").setContent("2").setAction(EnumAction.add).setInsertTime(Timestamp.from(Instant.now())));
        }
        // 假设版本二返回值
        if (versionIdList.stream().findFirst().get().equals("v2")) {
            return CollUtil.newArrayList(
                    new EntityA().setAId("1").setContent("2").setAction(EnumAction.delete).setInsertTime(Timestamp.from(Instant.now())),
                    new EntityA().setAId("2").setContent("修改").setAction(EnumAction.update).setInsertTime(Timestamp.from(Instant.now())),
                    new EntityA().setAId("3").setContent("3").setAction(EnumAction.add).setInsertTime(Timestamp.from(Instant.now()))
            );
        }
        // 其他版本
        return CollUtil.newArrayList(new EntityA().setAId("3").setContent("other"));
    }

    public static void main(String[] args) {
        EntityAService entityAService = new EntityAService();
        List<String> fromVersionIdList = Arrays.asList("v1");
        List<String> toVersionIdList = Arrays.asList("v2");
        List<EntityA> fromData = entityAService.getVersionData(fromVersionIdList);
        System.out.println("===========源数据===========");
        System.out.println(fromData);
        List<EntityA> toVersionData = entityAService.getVersionData(toVersionIdList);
        System.out.println("===========目标数据===========");
        System.out.println(toVersionData);
        List<EntityA> diffData = entityAService.getDiffData(fromData, toVersionData);
        System.out.println("===========差异数据===========");
        System.out.println(diffData);
    }


}
