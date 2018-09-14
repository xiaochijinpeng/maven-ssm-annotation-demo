package com.cutiechi.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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

}
