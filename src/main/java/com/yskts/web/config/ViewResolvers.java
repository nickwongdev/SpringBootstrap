/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yskts.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring configuration class for setting up all the view resolvers.
 * 
 * @author niwong
 * @since 3/29/13
 */
@Configuration
public class ViewResolvers {
    // JSP View Resolver Strings
    public static final String JSP_PREFIX = "/WEB-INF/jsp/";
    public static final String JSP_SUFFIX = ".jsp";
    
    /**
     * Creates a JSP view resolver.
     * 
     * @return
     */
    @Bean
    public InternalResourceViewResolver configureInternalResourceViewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(JSP_PREFIX);
        viewResolver.setSuffix(JSP_SUFFIX);
        return viewResolver;
    }
}
