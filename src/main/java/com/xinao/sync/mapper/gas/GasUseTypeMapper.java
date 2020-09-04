package com.xinao.sync.mapper.gas;

import com.xinao.sync.config.DataSource;
import com.xinao.sync.entity.gas.GasUseTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasUseTypeMapper extends BaseMapper<GasUseTypeEntity> {
    @DataSource("otherDataSource")
    List<GasUseTypeEntity> getList();
}
