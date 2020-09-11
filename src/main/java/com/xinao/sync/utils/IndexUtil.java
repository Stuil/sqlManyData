package com.xinao.sync.utils;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicInteger;

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
        AtomicInteger atomicInteger=new AtomicInteger(8);
        System.out.println(atomicInteger.getAndAdd(2)+"----"+atomicInteger);
    }
}
