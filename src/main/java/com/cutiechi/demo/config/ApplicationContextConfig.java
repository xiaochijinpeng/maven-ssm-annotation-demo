package com.cutiechi.demo.config;

import org.mybatis.spring.SqlSessionFactoryBean;

import org.mybatis.spring.mapper.MapperScannerConfigurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * Spring Application Context 配置类
 *
 * @author Cutie Chi
 */
@Configuration
@ComponentScan(
    basePackages = {
        "com.cutiechi.demo"
    },
    excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
    }
)
public class ApplicationContextConfig {

    /**
     * SQL Session Factory Bean 配置
     *
     * @param dataSource 数据源 Bean
     * {@link DataSourceConfig 数据源配置类}
     * @return SQL Session Factory Bean
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory (DataSource dataSource) {

        // 定义 SQL Session Factory Bean
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        // 为 SQL Session Factory Bean 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    /**
     * Mapper Scanner Configure Bean 配置
     *
     * @return Mapper Scanner Configure Bean
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer () {

        // 定义 Mapper Scanner Configure Bean
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();

        // 为 Mapper Scanner Configure Bean 设置 SQL Session Factory Bean 名称
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }
}
