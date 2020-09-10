package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasBookNoEntity;
import com.xinao.sync.mapper.gas.GasBookNoMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
@Service
@DataSource(DataSourceEnum.DB2)
public class GasBookNoServiceImpl extends ServiceImpl<GasBookNoMapper, GasBookNoEntity> implements GasBookNoService {

    @Override
    public GasBookNoEntity getBooks(String communityId) {
        return this.list(new QueryWrapper<GasBookNoEntity>()
                .eq("communityId",communityId).orderByDesc("id")).get(0);
    }

    @Override
    public GasBookNoEntity getOnes(Wrapper<GasBookNoEntity> queryWrapper) {
        return this.getOne(queryWrapper);
    }

    @Override
    public boolean saves(GasBookNoEntity bookNoEntity) {
        return this.save(bookNoEntity);
    }

    @Override
    public boolean updates(GasBookNoEntity bookNoEntity) {
        return this.updateById(bookNoEntity);
    }
}
