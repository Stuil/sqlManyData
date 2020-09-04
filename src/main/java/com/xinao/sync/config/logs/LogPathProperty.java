package com.xinao.sync.config.logs;

import ch.qos.logback.core.PropertyDefinerBase;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title: LogPathProperty
 * @description: 日志动态路径
 * @date: 2020/9/4
 * @author: stuil
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

public class LogPathProperty extends PropertyDefinerBase {

    @Override
    public String getPropertyValue() {
        String jar_parent = "";
        try {
            jar_parent = new File(ResourceUtils.getURL("classpath:").getPath())
                    .getParentFile().getParentFile().getParent();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return jar_parent;
    }
}
