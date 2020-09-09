package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinao.sync.entity.gas.GasUserChargeRecord2020Entity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasUserChargeRecord2020Service extends IService<GasUserChargeRecord2020Entity> {
    boolean saveOrUpdates(GasUserChargeRecord2020Entity entityList);
}
