package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinao.sync.entity.gas.GasMendGasEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasMendGasService extends IService<GasMendGasEntity> {
    boolean saveOrUpdates(GasMendGasEntity gasMendGasEntity);
}
