package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasMendGasEntity;
import com.xinao.sync.mapper.gas.GasMendGasMapper;
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
public class GasMendGasServiceImpl extends ServiceImpl<GasMendGasMapper, GasMendGasEntity> implements GasMendGasService {
    @Override
    public boolean saveOrUpdates(GasMendGasEntity gasMendGasEntity) {
        return this.saveOrUpdate(gasMendGasEntity);
    }
}
