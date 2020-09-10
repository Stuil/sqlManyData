package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasMeterEntity;
import com.xinao.sync.mapper.gas.GasMeterMapper;
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
public class GasMeterServiceImpl extends ServiceImpl<GasMeterMapper, GasMeterEntity> implements GasMeterService {
    @Override
    public boolean insertMeter(GasMeterEntity gasMeterEntity) {
        return this.saveOrUpdate(gasMeterEntity);
    }
}
