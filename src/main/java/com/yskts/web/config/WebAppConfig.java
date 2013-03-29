package com.yskts.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * com.yskts.config
 *
 * @author nwong
 * @todo Add Javadoc
 * @since 3/29/13
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.yskts.web.controller")
public class WebAppConfig {

	@Bean
	public InternalResourceViewResolver configureInternalResourceViewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
