package com.xinao.sync.service.gas;

import com.xinao.sync.config.DataSource;
import com.xinao.sync.entity.gas.GasUseTypeEntity;
import com.xinao.sync.mapper.gas.GasUseTypeMapper;
import com.xinao.sync.service.gas.GasUseTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
@Service
@DataSource("otherDataSource")
public class GasUseTypeServiceImpl extends ServiceImpl<GasUseTypeMapper, GasUseTypeEntity> implements GasUseTypeService {

    @Autowired
    GasUseTypeMapper mapper;
    @Override
    public List<GasUseTypeEntity> getList() {
        return mapper.getList();
    }
}
