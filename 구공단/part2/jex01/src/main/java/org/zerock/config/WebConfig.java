package org.zerock.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
	// for "root" application context (non-webinfrastructure) configuration. 
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}
	
	//for DispatcherServletapplication context (Spring MVC infrastructure) configuration.
	@Override 
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}
	
	//Specify the servlet mapping(s) for the DispatcherServlet
	//for example "/", "/app", etc.
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
}
