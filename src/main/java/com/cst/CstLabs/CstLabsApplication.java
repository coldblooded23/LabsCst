package com.cst.CstLabs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableAutoConfiguration


@PropertySources({
@PropertySource(ignoreResourceNotFound=true, value="classpath:CstLabs.properties")
})
@RestController
public class CstLabsApplication extends SpringBootServletInitializer {
	private static final Logger LOGGER = LogManager.getLogger(CstLabsApplication.class);	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CstLabsApplication.class);	
	}
	
	public static void main(String[] args) {
		LOGGER.info("CstLabsApplication application is Started");
		SpringApplication.run(CstLabsApplication.class, args);
	}

}
