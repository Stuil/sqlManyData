package com.xinao.sync.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @title: properConfig
 * @description:
 * @date: 2020/9/8
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "config")
@Data
public class ProperConfig {

    Integer isLogImpl;

}
