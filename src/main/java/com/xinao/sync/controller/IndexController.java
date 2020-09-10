package com.xinao.sync.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.xinao.sync.config.MyBatiesPlusConfiguration;
import com.xinao.sync.entity.gas.GasUserChargeRecordEntity;
import com.xinao.sync.mapper.gas.GasUserChargeRecordMapper;
import com.xinao.sync.service.IndexServer;
import com.xinao.sync.service.gas.GasMeterReadingService;
import com.xinao.sync.service.gas.GasUseTypeService;
import com.xinao.sync.service.gas.GasUserChargeRecordService;
import com.xinao.sync.service.xinao.GastypeService;
import com.xinao.sync.utils.MoneyUtil;
import com.xinao.sync.utils.SyncUtil;
import org.nutz.lang.Times;
import org.nutz.lang.util.NutMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

/**
 * @title: IndexController
 * @description: index
 * @date: 2020/9/4
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */
@RestController
public class IndexController {
    @Autowired
    GastypeService gastypeService;
    @Autowired
    GasUseTypeService typeService;

    @Autowired
    GasUserChargeRecordService service;
    @Autowired
    GasUserChargeRecordMapper mapper;
    @Autowired
    GasMeterReadingService readingService;

    @Autowired
    IndexServer indexServer;

    @RequestMapping("/index")
    public String index(Integer id){
        return indexServer.dataSync(id);
    }
    @RequestMapping("/select")
    public String select(Integer id){
        MyBatiesPlusConfiguration.getTableName("2020");
        service.getById("000000000");
        readingService.getById("0012164");
    /*    MyBatiesPlusConfiguration.getTableName("2019");
        service.getById("000000000");
        MyBatiesPlusConfiguration.getTableName("2018");
        service.getById("000000000");*/
        typeService.getById(1);
        return "1";
    }
}
