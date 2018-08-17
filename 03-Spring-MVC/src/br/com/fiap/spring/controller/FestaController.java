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

	//método que abre a página com o formulário
	@GetMapping("cadastrar")
	public String abrirForm() {
		return "festa/form";
	}
	
	//método que processa as informações do formulário
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Festa f) {
		return new ModelAndView("festa/form").addObject("msg", "Festa cadastrada");
	}
		
}