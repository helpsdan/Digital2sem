package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cadastro")
public class CadastroController {

	//método que abre a página com o formulário
	@GetMapping("enviar")
	public String abrirForm() {
		return "cadastro/form";
	}
	
	//método que processa as informações do formulário
	@PostMapping("enviar")
	public String processarForm(String placa, double preco, boolean automatico, String marca) {
		System.out.println(placa + " " + preco + " " + automatico + " " + marca);
		return "cadastro/form";
	}
	
}
