package com.xinao.sync.service.xinao;

import com.xinao.sync.entity.xinao.Card;
import com.xinao.sync.mapper.xinao.CardMapper;
import com.xinao.sync.service.xinao.CardService;
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
public class CardServiceImpl extends ServiceImpl<CardMapper, Card> implements CardService {

}
