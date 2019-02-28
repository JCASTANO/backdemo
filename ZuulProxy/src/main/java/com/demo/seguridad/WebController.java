package com.demo.seguridad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
public class WebController {

	@RequestMapping({"/","index"})
	public String inicio() {
		return "index";
	}

	@RequestMapping("/webprivado")
	public String privado() {
		return "privado";
	}
	@RequestMapping("/webpublico")
	public String loginpub() {
		return "publico";
	}
	@RequestMapping("/webadmin")
	public String admin() {
		return "admin";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
