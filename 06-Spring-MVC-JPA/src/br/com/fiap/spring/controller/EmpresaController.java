package br.com.fiap.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.spring.dao.EmpresaDAO;
import br.com.fiap.spring.model.Empresa;

@Controller
@RequestMapping("empresa")
public class EmpresaController {

	@Autowired
	private EmpresaDAO dao;
	
	@GetMapping("cadastrar")
	public String cadastrar(Empresa empresa) {
		return "empresa/cadastro";
	}
	
	@Transactional
	@PostMapping("cadastrar")
	public String cadastrar(@Valid Empresa empresa, BindingResult result, RedirectAttributes r) {
		if(result.hasErrors()) {
			return cadastrar(empresa);
		}
		
		dao.create(empresa);
		r.addFlashAttribute("msg", "Empresa cadastrada");		
		return "redirect:/empresa/cadastrar";
	}
	
	@GetMapping("listar")
	public ModelAndView abrirLista() {
		return new ModelAndView("empresa/lista").addObject("empresa", dao.list());
	}
	
	@GetMapping("editar/{id}")
	public ModelAndView abrirEdicao(@PathVariable("id") int codigo) {
		return new ModelAndView("empresa/edicao").addObject("empresa", dao.read(codigo));
	}
	
	@Transactional
	@PostMapping("editar")
	public String processarEdicao(Empresa empresa, RedirectAttributes r) {
		dao.update(empresa);
		r.addFlashAttribute("msg", "Empresa atualizada!");
		return "redirect:/empresa/listar";
	}
	
	@Transactional
	@PostMapping("remover")
	public String remover(int codigo, RedirectAttributes r) {
		try {
			dao.delete(codigo);
			r.addFlashAttribute("msg", "Empresa excluída!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/empresa/listar";
	}
}
