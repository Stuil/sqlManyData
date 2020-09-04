package com.xinao.sync;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan({"com.xinao.sync.mapper.xinao","com.xinao.sync.mapper.gas","com.xinao.sync.mapper.*"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(SyncApplication.class, args);
    }

}
