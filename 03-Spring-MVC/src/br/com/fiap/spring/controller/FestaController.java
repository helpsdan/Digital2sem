package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.spring.model.Festa;

@Controller
@RequestMapping("festa")
public class FestaController {

	//m�todo que abre a p�gina com o formul�rio
	@GetMapping("cadastrar")
	public String abrirForm() {
		return "festa/form";
	}
	
	//m�todo que processa as informa��es do formul�rio
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Festa f) {
		return new ModelAndView("festa/form").addObject("msg", "Festa cadastrada");
	}
		
}