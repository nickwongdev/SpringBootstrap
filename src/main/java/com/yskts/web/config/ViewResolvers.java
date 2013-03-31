package com.yskts.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

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
    
    // Freemarker View Resolver Strings and Config
    public static final String FTL_PREFIX = "";
    public static final String FTL_SUFFIX = ".ftl";

    /**
     * Creates a Freemarker View Resolver.
     *
     * @return
     */
    @Bean
    public FreeMarkerViewResolver ftlViewResolver() {

        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
        viewResolver.setPrefix(FTL_PREFIX);
        viewResolver.setSuffix(FTL_SUFFIX);
        viewResolver.setOrder(1);
        return viewResolver;
    }

    /**
     * Creates a JSP view resolver.
     *
     * @return
     */
    @Bean
    public InternalResourceViewResolver jspViewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(JSP_PREFIX);
        viewResolver.setSuffix(JSP_SUFFIX);
        viewResolver.setOrder(2);
        return viewResolver;
    }
}
