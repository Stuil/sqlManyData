package com.xinao.sync.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @title: SpringUtil
 * @description:
 * @date: 2020/9/9
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> cla) {
        return applicationContext.getBean(cla);
    }

    public static <T> T getBean(String name, Class<T> cal) {
        return applicationContext.getBean(name, cal);
    }

    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

    public static String getProperty(String key) {
        return applicationContext.getBean(Environment.class).getProperty(key);
    }
}
