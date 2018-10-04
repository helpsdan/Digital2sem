package br.com.fiap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.jpa.dao.LivroDAO;
import br.com.fiap.spring.model.Livro;

@Controller
@RequestMapping("livro")
public class LivroController {
	
	@Autowired 
	private LivroDAO dao;
	
	@GetMapping("cadastrar")
	public String abrirForm() {
		return "livro/form";
	}
	
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Livro livro, RedirectAttributes rs) {
		dao.create(livro);
		rs.addFlashAttribute("msg", "Livro cadastrado!");
		return new ModelAndView("redirect:/livro/listar");
	}
	
	@GetMapping("editar/{id}")
	public ModelAndView abrirEdicao(@PathVariable("id")int codigo) {
		return new ModelAndView("livro/edicao").addObject("livro", dao.read(codigo));
	}
	
	@PostMapping("editar")
	@Transactional
	public ModelAndView processarEdicao(Livro livro, RedirectAttributes rs) {
		dao.update(livro);
		rs.addFlashAttribute("msg", "Livro atualizado!");
	}
	
	@GetMapping("listar")
	public ModelAndView listar() {
		return new ModelAndView("livro/lista").addObject("livro", dao.list());
	}
	
	@PostMapping("remover")
	@Transactional
	public String remover(int codigo, RedirectAttributes rs) {
		try {
			dao.delete(codigo);
			rs.addFlashAttribute("msg", "Livro removido!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@GetMapping("buscar")
	public ModelAndView pesquisarLivro(String titulo) {
		return new ModelAndView("livro/lista")
				.addObject("livro", dao.buscaPorTítulo(titulo));
	}
	
	
}
