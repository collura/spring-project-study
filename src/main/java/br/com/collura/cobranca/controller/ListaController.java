package br.com.collura.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListaController {
	
	private final String router = "NovoTitulo";
	
	@RequestMapping("/lista/novo")
	public String novo() {
		return router;
	}

}
