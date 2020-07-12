package com.albg.code.domain.service.impl;

import com.albg.code.domain.entitys.VersionInfo;
import com.albg.code.domain.mapper.VersionInfoMapper;
import com.albg.code.domain.service.interfaces.VersionInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 版本记录表 服务实现类
 * </p>
 *
 * @author zhengjw
 * @since 2020-07-12
 */
@Service
public class VersionInfoServiceImpl extends ServiceImpl<VersionInfoMapper, VersionInfo> implements VersionInfoService {

}
