package com.xinao.sync.config;

import java.lang.annotation.*;

/**
 * @description: 注解
 * @author: zwh
 * @version: 1.0
 */

@Target({ElementType.METHOD,ElementType.TYPE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String value() default "masterDataSource";//该值即key的值
}
