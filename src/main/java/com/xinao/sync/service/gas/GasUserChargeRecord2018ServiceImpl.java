package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasUserChargeRecord2018Entity;
import com.xinao.sync.mapper.gas.GasUserChargeRecord2018Mapper;
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
public class GasUserChargeRecord2018ServiceImpl extends ServiceImpl<GasUserChargeRecord2018Mapper, GasUserChargeRecord2018Entity> implements GasUserChargeRecord2018Service {

    @Override
    public boolean saveOrUpdates(GasUserChargeRecord2018Entity entityList) {
        return this.saveOrUpdate(entityList);
    }
}
