package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xinao.sync.entity.gas.GasRefundGasEntity;
import com.xinao.sync.mapper.gas.GasRefundGasMapper;
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
public class GasRefundGasServiceImpl extends ServiceImpl<GasRefundGasMapper, GasRefundGasEntity> implements GasRefundGasService {
    @Override
    public boolean saveOrUpdates(GasRefundGasEntity refundGasEntities) {
        return this.saveOrUpdate(refundGasEntities);
    }
}
