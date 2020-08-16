package juc.version;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.NumberUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: MrZheng
 * @Date: 2020/8/16 19:07
 * @Description:
 */
public interface IVersionControl<T extends IVersionControlEntity> {

    /**
     * 获取版本数据
     *
     * @param versionIdList 版本主键列表
     * @return List<T>
     */
    List<T> getVersionData(List<String> versionIdList);

    /**
     * 还版本结构数据
     *
     * @param dataList 数据列表
     * @return List<T>
     */
    default List<T> reotreVersionData(List<T> dataList) {
        if (CollUtil.isEmpty(dataList)) {
            return CollUtil.newArrayList();
        }
        // 时间逆序排序
        List<T> sortList = dataList.stream().sorted(Comparator.comparing(t -> t.getRecordTime()))
                .collect(Collectors.toCollection(LinkedList::new));
        // 根据ID进行分组
        Map<String, List<T>> groupByIdDataMap = sortList.stream().collect(Collectors.groupingBy(T::getDataId));
        // 获取每个分组的第一个数据
        List<T> result = CollUtil.newArrayList();
        groupByIdDataMap.forEach((k, v) -> {
            result.add(v.stream().findFirst().get());
        });
        // 过滤操作行为为删除的数据
        return result.stream().filter(item -> !Objects.equals(item.getDataAction(), EnumAction.delete)).collect(Collectors.toList());
    }

    /**
     * @param fromList 源数据
     * @param toList   目标数据
     * @return List<T>
     */
    default List<T> getDiffData(List<T> fromList, List<T> toList) {
        if (CollUtil.isEmpty(fromList) && CollUtil.isEmpty(toList)) {
            return CollUtil.newArrayList();
        }
        // 源数据为空，则目标数据全为新增
        if (CollUtil.isEmpty(fromList)) {
            toList.stream().forEach(item -> item.setDataAction(EnumAction.add));
            return toList;
        }
        // 目标数据为空，则源数据全为删除
        if (CollUtil.isEmpty(toList)) {
            fromList.forEach(item -> item.setDataAction(EnumAction.delete));
            return fromList;
        }

        List<T> resultList = new ArrayList<>();

        // 1.遍历fromList
        for (T item : fromList) {
            // 如果发现toList不存在的项，即更改操作行为，为delete，然后添加到差异数据集合resultList
            if (!toList.contains(item)) {
                item.setDataAction(EnumAction.delete);
                resultList.add(item);
            }
        }
        // 2.遍历toList
        for (T item : toList) {
            // 2.1.存在记录，判断是否需要更改，需要则添加更改记录
            if (fromList.contains(item)) {
                int position = fromList.indexOf(item);
                T fromItem = fromList.get(position);
                if (item.isNotEqual(fromItem)) {
                    item.setDataAction(EnumAction.update);
                    resultList.add(item);
                }
            } else {
                // 2.2 不存在信息全部改为新增状态
                item.setDataAction(EnumAction.add);
                resultList.add(item);
            }
        }

        return resultList;
    }


}
