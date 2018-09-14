package com.cutiechi.demo.config;

import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 数据源配置类
 *
 * @author Cutie Chi
 */
@Configuration
@PropertySource("classpath:data-source.properties")
public class DataSourceConfig {

    /**
     * 数据库驱动类名
     */
    @Value("${driver}")
    private String driverClassName;

    /**
     * 数据库连接地址
     */
    @Value("${url}")
    private String url;

    /**
     * 数据库用户名
     */
    @Value("${user}")
    private String username;

    /**
     * 数据库密码
     */
    @Value("${password}")
    private String password;

    /**
     * 数据源 Bean 配置方法
     *
     * 使用 Apache Commons DBCP 2 数据库连接池
     *
     * @return 数据源 Bean
     */
    @Bean
    public DataSource dataSource () {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(driverClassName);
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        return basicDataSource;
    }
}
