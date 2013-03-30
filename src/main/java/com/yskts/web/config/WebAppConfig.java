package com.yskts.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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


}
