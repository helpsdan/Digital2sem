package br.com.fiap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.jpa.exception.KeyNotFoundException;
import br.com.fiap.spring.model.Bebida;

@Controller
@RequestMapping("bebida")
public class BebidaController {

	@Autowired
	private BebidaDAO dao;
	
	@GetMapping("buscar")
	public ModelAndView pesquisarBebida(String nomeBebida) {
		return new ModelAndView("bebida/lista")
				.addObject("bebidas", dao.buscarPorNome(nomeBebida));
	}
	
}





