package com.cutiechi.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring MVC Dispatcher Servlet 配置类
 *
 * @author Cutie Chi
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.cutiechi.demo.web.controller")
public class DispatcherServletConfig {

    /**
     * Spring MVC 视图解析器 Bean
     *
     * @return 视图解析器 Bean
     */
    @Bean
    public ViewResolver viewResolver () {

        // 定义 InternalResourceResolver
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        // 设置视图解析器前缀为 /WEB-INF/pages/
        viewResolver.setPrefix("/WEB-INF/pages/");

        // 设置视图解析器后缀为 .jsp
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
