package com.demo.seguridad;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@EnableResourceServer
@RestController
@CrossOrigin("*")
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter
{
	@Autowired 
	ConsumerTokenServices tokenServices;
	 
	@RequestMapping("/publica")
	public String publico() {
		return "Pagina Publica";
	}
	@RequestMapping("/privada")
	public String privada() {
		return "Pagina Privada";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "Pagina Administrador";
	}
	
	
	@DeleteMapping("/revoke-token")
	@ResponseBody
	public void revocarToken(HttpServletRequest request){
		
		String authorization = request.getHeader("Authorization");
		if (authorization != null && authorization.contains("Bearer")) {
			String tokenId = authorization.substring("Bearer".length() + 1);
			tokenServices.revokeToken(tokenId);
		}

	}
	

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests().antMatchers("/oauth/token", "/oauth/authorize**", "/publica").permitAll();
		
		http.requestMatchers()
			
		.and().requestMatchers()
		.antMatchers("/privada","/customer/peliculas","/revoke-token")
		.and().authorizeRequests()
		.antMatchers("/privada","/customer/peliculas","/revoke-token").access("hasRole('USER')")
		
		.and().requestMatchers().antMatchers("/admin")
		.and().authorizeRequests()
		.antMatchers("/admin").access("hasRole('ADMIN')");
	}   

}

