package br.com.fiap.jpa.dao;

import java.util.List;

import br.com.fiap.spring.model.Livro;

public interface LivroDAO extends GenericDAO<Livro, Integer>{
	
	List<Livro> buscaPorTítulo(String titulo);
	
}
