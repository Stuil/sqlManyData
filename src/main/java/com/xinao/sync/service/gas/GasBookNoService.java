package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xinao.sync.entity.gas.GasBookNoEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasBookNoService extends IService<GasBookNoEntity> {

    GasBookNoEntity getBooks(String communityId);

    GasBookNoEntity getOnes(Wrapper<GasBookNoEntity> queryWrapper);

    boolean saves(GasBookNoEntity bookNoEntity);

    boolean updates(GasBookNoEntity bookNoEntity);
}
