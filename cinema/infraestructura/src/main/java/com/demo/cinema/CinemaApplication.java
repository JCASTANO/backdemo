package com.demo.cinema;


import org.jboss.jandex.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Clase init de spring boot
 * 
 * @author jose.lozano
 *
 */
@SpringBootApplication(exclude= {SecurityAutoConfiguration.class, ElasticsearchDataAutoConfiguration.class})
@EnableDiscoveryClient
public class CinemaApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CinemaApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Main.class);
		application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
		SpringApplication.run(CinemaApplication.class, args);
	}

}
