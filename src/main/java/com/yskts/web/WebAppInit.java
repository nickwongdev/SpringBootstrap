package com.yskts.web;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * com.yskts.web
 *
 * @author nwong
 * @todo Add Javadoc
 * @since 3/29/13
 */
public class WebAppInit implements WebApplicationInitializer {

	@Override
	public void onStartup(final ServletContext servletContext) throws ServletException {

		assert servletContext != null;
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.scan("com.yskts.web.config");

		servletContext.addListener(new ContextLoaderListener(rootContext));

		ServletRegistration.Dynamic appServlet = servletContext.addServlet(
			"appServlet",
			new DispatcherServlet(rootContext)
		);
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("*.html");

	}
}
