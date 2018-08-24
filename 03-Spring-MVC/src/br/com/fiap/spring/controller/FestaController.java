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

	@GetMapping("cadastrar")
	public String abrirForm() {
		return "festa/form"; //pasta + arquivo jsp
	}
	
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Festa festa) {
		//chamar o dao...
		return new ModelAndView("festa/form") //pasta + arquivo jsp
				.addObject("msg", "Festa cadastrada!"); // mensagem para a tela jsp
	}
	
}












