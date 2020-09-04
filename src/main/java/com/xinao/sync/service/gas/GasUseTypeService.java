package com.xinao.sync.service.gas;

import com.xinao.sync.entity.gas.GasUseTypeEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasUseTypeService extends IService<GasUseTypeEntity> {
        List<GasUseTypeEntity> getList();
}
