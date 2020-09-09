package com.xinao.sync.service.gas;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinao.sync.entity.gas.GasUserEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author stuil
 * @since 2020-09-04
 */
public interface GasUserService extends IService<GasUserEntity> {
    boolean insetUser(GasUserEntity gasUserEntity);

    boolean updateUser(GasUserEntity gasUserEntity);

    GasUserEntity getByAcc(String account);
}
