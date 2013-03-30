package com.yskts.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Initializes the Web Application. 
 * 
 * <p>I treat this class like a Main class in a traditional Java application as
 * it is basically the startup routine for the application. </p>
 * 
 * <p>This class uses the Spring AnnotationConfigWebApplicationContext to build
 * a Servlet and direct Spring to the Java config for the application.</p>
 *
 * @author nwong
 * @since 3/29/13
 */
public class WebAppInit implements WebApplicationInitializer {
    
    public static final String CONFIG_SCAN = "com.yskts.web.config";
    public static final String APP_SERVLET = "appServlet";
    public static final String SERVLET_MAPPING = "*.html";

    /**
     * Sets up the WebApplicationContext when the application starts up.
     * 
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(final ServletContext servletContext) throws ServletException {

        assert servletContext != null;
        
        // Get a Spring AnnotationConfigWebApplicationContext
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        
        // Scan and read the Java configuration classes
        rootContext.scan(CONFIG_SCAN);

        // Assign the WebApplicationContext to the ServletContext
        servletContext.addListener(new ContextLoaderListener(rootContext));

        // Create a new Servlet so we can listen for requests
        ServletRegistration.Dynamic appServlet = servletContext.addServlet(
                APP_SERVLET,
                new DispatcherServlet(rootContext));
        
        // Listen for request patterns
        appServlet.addMapping(SERVLET_MAPPING);
    }
}
