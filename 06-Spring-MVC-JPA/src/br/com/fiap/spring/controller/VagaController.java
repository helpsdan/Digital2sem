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
import br.com.fiap.spring.dao.VagaDAO;
import br.com.fiap.spring.model.Modelo;
import br.com.fiap.spring.model.Vaga;

@Controller
@RequestMapping("vaga")
public class VagaController {

	@Autowired
	private VagaDAO dao;
	@Autowired
	private EmpresaDAO daoE;

	@GetMapping("cadastrar")
	public ModelAndView cadastrar(Vaga vaga) {
		ModelAndView retorno = new ModelAndView("vaga/cadastro");
		retorno.addObject("empresas",daoE.list());
		retorno.addObject("modelos", Modelo.values());
		return retorno;
	}

	@Transactional
	@PostMapping("cadastrar")
	public ModelAndView cadastrar(@Valid Vaga vaga, BindingResult result, RedirectAttributes r) {
		if (result.hasErrors()) {
			return cadastrar(vaga);
		}
		dao.create(vaga);
		r.addFlashAttribute("msg", "Vaga cadastrada");
		return new ModelAndView("redirect:/vaga/cadastrar");
	}
	
	@GetMapping("listar")
	public ModelAndView abrirLista() {
		return new ModelAndView("vaga/lista").addObject("vaga", dao.list());
	}
	
	
	@GetMapping("editar/{id}")
	public ModelAndView abrirEdicao(@PathVariable("id") int codigo) {
		return new ModelAndView("vaga/edicao").addObject("vaga", dao.read(codigo)).addObject("empresas",daoE.list());
	}
	
	@Transactional
	@PostMapping("editar")
	public String processarEdicao(Vaga vaga, RedirectAttributes r) {
		dao.update(vaga);
		r.addFlashAttribute("msg", "Vaga atualizada!");
		return "redirect:/vaga/listar";
	}
	@Transactional
	@PostMapping("remover")
	public String remover(int codigo, RedirectAttributes r) {
		try {
			dao.delete(codigo);
			r.addFlashAttribute("msg", "Vaga excluída!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/vaga/listar";
	}
	
}
