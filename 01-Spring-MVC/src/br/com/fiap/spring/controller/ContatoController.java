package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contato")
public class ContatoController {

	//m�todo que abre a p�gina com o formul�rio
	@GetMapping("enviar")
	public String abrirForm() {
		return "contato/form";
	}
	
	//m�todo que processa as informa��es do formul�rio
	@PostMapping("enviar")
	public String processarForm(String nome, String email, String telefone) {
		System.out.println(nome + " " + email + " " + telefone);
		return "contato/form";
	}
	
}
