package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinao.sync.entity.gas.GasRefundGasEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasRefundGasService extends IService<GasRefundGasEntity> {
    boolean saveOrUpdates(GasRefundGasEntity refundGasEntities);
}
