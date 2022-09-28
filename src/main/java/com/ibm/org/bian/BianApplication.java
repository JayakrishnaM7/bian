package com.ibm.org.bian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;

@SpringBootApplication
@ComponentScan(basePackages ="com.ibm.org.bian.*")
public class BianApplication {

	public static void main(String[] args) {
		SpringApplication.run(BianApplication.class, args);
	}
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("swagger-ui.html")
	      .addResourceLocations("classpath:/META-INF/resources/");

	    registry.addResourceHandler("/webjars/**")
	      .addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
