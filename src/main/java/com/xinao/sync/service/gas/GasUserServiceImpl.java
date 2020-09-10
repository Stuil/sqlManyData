package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xinao.sync.config.DataSource;
import com.xinao.sync.config.DataSourceEnum;
import com.xinao.sync.entity.gas.GasUserEntity;
import com.xinao.sync.mapper.gas.GasUserMapper;
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
public class GasUserServiceImpl extends ServiceImpl<GasUserMapper, GasUserEntity> implements GasUserService {


    @Override
    public boolean insetUser(GasUserEntity gasUserEntity) {
        return this.save(gasUserEntity);
    }

    @Override
    public boolean updateUser(GasUserEntity gasUserEntity) {
        return this.updateById(gasUserEntity);
    }

    @Override
    public GasUserEntity getByAcc(String account) {
        return this.getById(account);
    }
}
