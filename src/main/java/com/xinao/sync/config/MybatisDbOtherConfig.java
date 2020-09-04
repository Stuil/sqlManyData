package com.xinao.sync.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
/**
 * @title: MybatisDbOtherConfig
 * @description: 其他数据源
 * @date: 2020/9/4
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */

@Configuration
@MapperScan(basePackages = "com.xinao.sync.mapper.gas",sqlSessionFactoryRef = "otherSqlSessionFactory")
public class MybatisDbOtherConfig {
    @Bean(name = "otherDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.other")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "otherTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("otherDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean(name = "otherSqlSessionFactory")
    public SqlSessionFactory basicSqlSessionFactory(@Qualifier("otherDataSource") DataSource basicDataSource) throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(basicDataSource);
        factoryBean.setTypeAliasesPackage("com.xinao.sync.entity.gas");
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/*/*Mapper.xml"));
        return factoryBean.getObject();
    }
    @Bean(name = "otherSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(
            @Qualifier("otherSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
