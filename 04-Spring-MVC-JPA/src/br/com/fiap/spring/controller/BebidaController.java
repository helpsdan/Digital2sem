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
import br.com.fiap.spring.model.Bebida;

@Controller
@RequestMapping("bebida")
public class BebidaController {

	@Autowired
	private BebidaDAO dao;

	@GetMapping("editar/{id}")
	public ModelAndView abrirEdicao(@PathVariable("id") int codigo) {
		return new ModelAndView("bebida/edicao").addObject("bebida", dao.read(codigo));
	}
	
	
	@GetMapping("listar")
	public ModelAndView abrirLista() {
		return new ModelAndView("bebida/listar").addObject("bebidas", dao.list());
	}

	@GetMapping("cadastrar")
	public String abrirForm() {
		return "bebida/form"; // pasta + arquivo jsp
	}

	@PostMapping("cadastrar")
	@Transactional
	public ModelAndView processarForm(Bebida bebida, RedirectAttributes r) {
		dao.create(bebida);
		//adiciona uma mensagem no objeto que guarda informação apos redirect
		r.addFlashAttribute("msg", "Bebida cadastrada");
		//redirect envia para uma url
		return new ModelAndView("redirect:/bebida/cadastrar"); // pasta + arquivo jsp
	}

}
