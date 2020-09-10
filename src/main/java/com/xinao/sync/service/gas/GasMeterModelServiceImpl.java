package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasMeterModelEntity;
import com.xinao.sync.mapper.gas.GasMeterModelMapper;
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
public class GasMeterModelServiceImpl extends ServiceImpl<GasMeterModelMapper, GasMeterModelEntity> implements GasMeterModelService {

}
