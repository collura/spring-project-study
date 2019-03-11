package br.com.collura.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private String home = "Home";
	
	@RequestMapping("/")
	public String home() {
		return this.home;
	}
	
	@RequestMapping("/lista/novo")
	public String cadastro() {
		return "CadastrarTitulo";
	}

}
