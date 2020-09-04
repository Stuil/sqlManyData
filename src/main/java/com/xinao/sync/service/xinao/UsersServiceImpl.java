package com.xinao.sync.service.xinao;

import com.xinao.sync.entity.xinao.Users;
import com.xinao.sync.mapper.xinao.UsersMapper;
import com.xinao.sync.service.xinao.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
