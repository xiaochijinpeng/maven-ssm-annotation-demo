package com.cutiechi.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring MVC Dispatcher Servlet 配置类
 *
 * @author Cutie Chi
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.cutiechi.demo.web.controller")
public class DispatcherServletConfig {

}
