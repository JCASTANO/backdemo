package com.demo.seguridad;



import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@EnableResourceServer
@RestController
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests().antMatchers("/oauth/token", "/oauth/authorize**", "/publica","/revoke-token").permitAll();
		
		http.requestMatchers()
			
		.and().requestMatchers()
		.antMatchers("/privada","/customer/peliculas")
		.and().authorizeRequests()
		.antMatchers("/privada","/customer/peliculas").access("hasRole('USER')")
		
		.and().requestMatchers().antMatchers("/admin")
		.and().authorizeRequests()
		.antMatchers("/admin").access("hasRole('ADMIN')");
	}   

}

