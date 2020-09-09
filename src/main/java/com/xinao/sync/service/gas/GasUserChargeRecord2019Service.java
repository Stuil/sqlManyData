package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinao.sync.entity.gas.GasUserChargeRecord2019Entity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasUserChargeRecord2019Service extends IService<GasUserChargeRecord2019Entity> {
    boolean saveOrUpdates(GasUserChargeRecord2019Entity entityList);
}
