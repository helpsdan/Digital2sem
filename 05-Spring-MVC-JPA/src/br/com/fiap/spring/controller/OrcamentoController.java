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

import br.com.fiap.jpa.dao.OrcamentoDAO;
import br.com.fiap.spring.model.Orcamento;

@Controller
@RequestMapping("orcamento")
public class OrcamentoController {

	@Autowired
	private OrcamentoDAO dao;	
	
	@Transactional
	@PostMapping("remover")
	public String remover(int codigo, RedirectAttributes r) {
		try {
			dao.delete(codigo);
			r.addFlashAttribute("msg", "Orçamento excluído!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/orcamento/listar";
	}
	
	@GetMapping("editar/{id}")
	public ModelAndView abrirEdicao(@PathVariable("id") int codigo) {
		return new ModelAndView("orcamento/edicao").addObject("orcamento", dao.read(codigo));
	}
	
	@Transactional
	@PostMapping("editar")
	public String processarEdicao(Orcamento orcamento, RedirectAttributes r) {
		dao.update(orcamento);
		r.addFlashAttribute("msg", "Orçamento atualizado!");
		return "redirect:/orcamento/listar";
	}
	
	@GetMapping("listar")
	public ModelAndView abrirLista() {
		return new ModelAndView("orcamento/lista").addObject("orcamento", dao.list());
	}
	
	@GetMapping("cadastrar")
	public String abrirForm() {
		return "orcamento/form";
	}
	
	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Orcamento orcamento, RedirectAttributes r) {
		dao.create(orcamento);
		//Adiciona uma mensagem no objeto que guarda informação após redirect
		r.addFlashAttribute("msg", "Orçamento cadastrado!");
		//Redirect envia para uma URL
		return new ModelAndView("redirect:/orcamento/cadastrar");
				
	}
	
}
