package com.albg.code.domain.service.impl;

import com.albg.code.domain.entitys.DbPresentInfo;
import com.albg.code.domain.mapper.DbPresentInfoMapper;
import com.albg.code.domain.service.interfaces.DbPresentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 当前数据库信息记录表 服务实现类
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Service
public class DbPresentInfoServiceImpl extends ServiceImpl<DbPresentInfoMapper, DbPresentInfo> implements DbPresentInfoService {

}
