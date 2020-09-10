package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasUseTypeEntity;
import com.xinao.sync.mapper.gas.GasUseTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

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
public class GasUseTypeServiceImpl extends ServiceImpl<GasUseTypeMapper, GasUseTypeEntity> implements GasUseTypeService {

    @Override
    public List<GasUseTypeEntity> getList() {
        return this.list();
    }
}
