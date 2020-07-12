package com.albg.code.domain.service.impl;

import com.albg.code.domain.entitys.DbHisInfo;
import com.albg.code.domain.mapper.DbHisInfoMapper;
import com.albg.code.domain.service.interfaces.DbHisInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 历史数据库信息记录表 服务实现类
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Service
public class DbHisInfoServiceImpl extends ServiceImpl<DbHisInfoMapper, DbHisInfo> implements DbHisInfoService {

}
