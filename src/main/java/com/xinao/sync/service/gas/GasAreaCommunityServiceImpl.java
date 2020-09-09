package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinao.sync.entity.gas.GasAreaCommunityEntity;
import com.xinao.sync.mapper.gas.GasAreaCommunityMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
@Service
public class GasAreaCommunityServiceImpl extends ServiceImpl<GasAreaCommunityMapper, GasAreaCommunityEntity> implements GasAreaCommunityService {

    @Override
    public Map<String, Object> getListAreaToMap() {
        Map<String, Object> map = new HashMap<>();
        this.list().forEach(item -> {
            map.put(item.getId(), item.getName());
        });
        return map;
    }

    @Override
    public GasAreaCommunityEntity getOnes(String name) {
        return this.getOne(new QueryWrapper<GasAreaCommunityEntity>().eq("name",name));
    }

    @Override
    public boolean saves(GasAreaCommunityEntity gasAreaCommunityEntity) {
        return this.save(gasAreaCommunityEntity);
    }

    @Override
    public boolean updates(GasAreaCommunityEntity gasAreaCommunityEntity) {
        return this.update(gasAreaCommunityEntity,new QueryWrapper<GasAreaCommunityEntity>().eq("name",gasAreaCommunityEntity.getName()));
    }
}
