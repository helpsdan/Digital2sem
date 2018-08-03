package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cadastro")
public class CadastroController {

	//m�todo que abre a p�gina com o formul�rio
	@GetMapping("enviar")
	public String abrirForm() {
		return "cadastro/form";
	}
	
	//m�todo que processa as informa��es do formul�rio
	@PostMapping("enviar")
	public String processarForm(String placa, double preco, boolean automatico, String marca) {
		System.out.println(placa + " " + preco + " " + automatico + " " + marca);
		return "cadastro/form";
	}
	
}
