package com.yskts.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

/**
 * Top level Web Application configuration class.
 *
 * @author nwong
 * @since 3/29/13
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.yskts.web.controller")
public class WebAppConfig {

    public static final String FTL_TEMPLATE_PATH = "/WEB-INF/freemarker/";

    /**
     * Creates a basic Freemarker config.
     *
     * @return
     */
    @Bean
    public FreeMarkerConfigurer freemarkerConfigurer() {

        FreeMarkerConfigurer freemarkerConfigurer = new FreeMarkerConfigurer();
        freemarkerConfigurer.setTemplateLoaderPath(FTL_TEMPLATE_PATH);
        return freemarkerConfigurer;
    }
}
