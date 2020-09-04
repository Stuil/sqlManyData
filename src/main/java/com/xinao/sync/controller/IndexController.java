package com.xinao.sync.controller;

import com.alibaba.fastjson.JSONObject;
import com.xinao.sync.config.DataSource;
import com.xinao.sync.mapper.gas.GasUseTypeMapper;
import com.xinao.sync.service.gas.GasUseTypeService;
import com.xinao.sync.service.xinao.GastypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/index")
    public String index(){
        // 主库  error
     //   gastypeService.list();
        // 从库  success
        return JSONObject.toJSONString(typeService.getList());
    }
}
