package com.xinao.sync.mapper.gas;

import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasUserChargeRecordEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
@DataSource(DataSourceEnum.DB2)
public interface GasUserChargeRecordMapper extends BaseMapper<GasUserChargeRecordEntity> {
}
