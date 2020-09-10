package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasUserChargeRecord2019Entity;
import com.xinao.sync.mapper.gas.GasUserChargeRecord2019Mapper;
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
public class GasUserChargeRecord2019ServiceImpl extends ServiceImpl<GasUserChargeRecord2019Mapper, GasUserChargeRecord2019Entity> implements GasUserChargeRecord2019Service {

    @Override
    public boolean saveOrUpdates(GasUserChargeRecord2019Entity entityList) {
        return this.saveOrUpdate(entityList);
    }
}
