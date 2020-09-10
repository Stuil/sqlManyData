package com.xinao.sync.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @title: TablesArray
 * @description:
 * @date: 2020/9/10
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

@Configuration
@ConfigurationProperties("mp")
@Data
public class TablesArray {

    private List<String> tableNames;

}