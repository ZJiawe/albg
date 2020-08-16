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

    @Override
    public List<EntityA> getVersionData(List<String> versionIdList) {
        // 假设版本二返回值
        if (versionIdList.stream().findFirst().get().equals("v2")) {
            return CollUtil.newArrayList(new EntityA().setAId("1safasdf")
                    .setContent("2").setAction(EnumAction.add).setInsertTime(Timestamp.from(Instant.now())));
        }
        // 假设版本三返回值
        if (versionIdList.stream().findFirst().get().equals("v3")) {
            return CollUtil.newArrayList(new EntityA().setAId("vvvv").setContent("3")
                    .setAction(EnumAction.add).setInsertTime(Timestamp.from(Instant.now())));
        }
        // 其他版本
        return CollUtil.newArrayList(new EntityA().setAId("fdjh").setContent("other"));
    }

    public static void main(String[] args) {
        EntityAService entityAService = new EntityAService();
        List<String> fromVersionIdList = Arrays.asList("v2");
        List<String> toVersionIdList = Arrays.asList("v3");
        List<EntityA> fromData = entityAService.getVersionData(fromVersionIdList);
        System.out.println(fromData);
        List<EntityA> toVersionData = entityAService.getVersionData(toVersionIdList);
        System.out.println(toVersionData);
        List<EntityA> diffData = entityAService.getDiffData(fromData, toVersionData);
        System.out.println(diffData);
    }


}
