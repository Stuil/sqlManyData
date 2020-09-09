package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinao.sync.entity.gas.GasAreaCommunityEntity;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasAreaCommunityService extends IService<GasAreaCommunityEntity> {

    Map<String,Object> getListAreaToMap();

    GasAreaCommunityEntity getOnes(String name);

    boolean saves(GasAreaCommunityEntity gasAreaCommunityEntity);

    boolean updates(GasAreaCommunityEntity gasAreaCommunityEntity);
}
