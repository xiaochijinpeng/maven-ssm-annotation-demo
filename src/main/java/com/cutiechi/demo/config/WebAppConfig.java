package com.cutiechi.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Web App 配置类, 相当于 web.xml
 *
 * @author Cutie Chi
 */
public class WebAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 加载 Spring Application Context 配置
     *
     * {@link ApplicationContextConfig}
     */
    @Override
    protected Class<?>[] getRootConfigClasses () {
        return new Class[]{
            ApplicationContextConfig.class
        };
    }

    /**
     * 加载 Spring MVC Dispatcher Servlet 配置
     *
     * {@link DispatcherServletConfig}
     */
    @Override
    protected Class<?>[] getServletConfigClasses () {
        return new Class[]{
            DispatcherServletConfig.class
        };
    }

    /**
     * 配置 Spring MVC Dispatcher Servlet 的 Mapping 为 /
     */
    @Override
    protected String[] getServletMappings () {
        return new String[]{
            "/"
        };
    }
}
