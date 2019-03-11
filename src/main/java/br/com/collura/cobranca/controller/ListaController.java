package br.com.collura.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Titulo;
import repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class ListaController {
	
	private final String router = "CadastrarTitulo";	
	
	@Autowired
	private Titulos titulos;
	
	@RequestMapping("/novo")					
	public String novo() {
		return router;
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Titulo titulo) {
		titulos.save(titulo);
		return "Cadastro Título";		
	}
}
