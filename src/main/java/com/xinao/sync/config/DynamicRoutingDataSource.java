package com.xinao.sync.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
 * @title: DynamicRoutingDataSource
 * @description: 动态路由
 * @date: 2020/9/4
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

public class DynamicRoutingDataSource extends AbstractRoutingDataSource {
    private static Logger logger = LoggerFactory.getLogger(DynamicRoutingDataSource.class);

    @Override
    protected Object determineCurrentLookupKey() {
        String dataSourceName = DynamicDataSourceContextHolder.getDataSourceRouterKey();
        logger.info("当前数据源是：{}", dataSourceName);
        return DynamicDataSourceContextHolder.getDataSourceRouterKey();
    }
}
