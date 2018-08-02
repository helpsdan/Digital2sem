package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contato")
public class ContatoController {

	//método que abre a página com o formulário
	@GetMapping("enviar")
	public String abrirForm() {
		return "contato/form";
	}
	
	//método que processa as informações do formulário
	@PostMapping("enviar")
	public String processarForm(String nome, String email, String telefone) {
		System.out.println(nome + " " + email + " " + telefone);
		return "contato/form";
	}
	
}
