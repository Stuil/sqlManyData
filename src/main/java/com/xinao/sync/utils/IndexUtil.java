package com.xinao.sync.utils;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title: IndexUtil
 * @description:
 * @date: 2020/9/4
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

public class IndexUtil {


    public static void main(String[] args) {
        String jar_parent = null;
        {
            try {
                jar_parent = new File(ResourceUtils.getURL("classpath:").getPath()).getParentFile().getParentFile().getParent();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println(jar_parent);
    }
}
