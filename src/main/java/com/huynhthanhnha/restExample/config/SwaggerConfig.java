package com.huynhthanhnha.restExample.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfig extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setBasePath("/restExample/api");
		beanConfig.setHost("localhost:8082");
		beanConfig.setTitle("Rest API demo swagger");
		beanConfig.setResourcePackage("com.huynhthanhnha.restExample");
		beanConfig.setPrettyPrint(true);
		beanConfig.setScan(true);
		beanConfig.setSchemes(new String[] {"http"});
		beanConfig.setVersion("1.0");

	}
}