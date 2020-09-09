package com.xinao.sync.service.xinao;

import com.xinao.sync.entity.xinao.Gastype;
import com.xinao.sync.mapper.xinao.GastypeMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
public class GastypeServiceImpl extends ServiceImpl<GastypeMapper, Gastype> implements GastypeService {

    @Override
    public List<Gastype> getList() {
        return this.list();
    }
}
