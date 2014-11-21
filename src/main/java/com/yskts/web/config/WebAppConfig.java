package com.yskts.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Top level Web Application configuration class. 
 * 
 * @author nwong
 * @since 3/29/13
 */
@Configuration
@EnableWebMvc
@ComponentScan({"com.yskts.web.controller","com.yskts.web.manager","com.yskts.web.dao"})
public class WebAppConfig {

    @Bean
    public UrlBasedViewResolver urlBasedViewResolver()
    {
        UrlBasedViewResolver res = new InternalResourceViewResolver();
        res.setViewClass(JstlView.class);
        res.setPrefix("/WEB-INF/jsp/");
        res.setSuffix(".jsp");

        return res;
    }
}
