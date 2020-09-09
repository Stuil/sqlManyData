package com.xinao.sync.service.xinao;

import com.xinao.sync.entity.xinao.Gastype;
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
public interface GastypeService extends IService<Gastype> {
    List<Gastype> getList();
}
