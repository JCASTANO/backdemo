package com.demo.seguridad;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	
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
}
