package br.com.fiap.jpa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fiap.jpa.dao.LivroDAO;
import br.com.fiap.spring.model.Livro;

@Repository
public class LivroDAOImpl extends GenericDAOImpl<Livro, Integer> implements LivroDAO{

	@Override
	public List<Livro> buscaPorTítulo(String titulo) {
		return em.createQuery("from Livro where upper(titulo) like upper(:m)", Livro.class)
				.setParameter("m", "%"+titulo+"%")
				.getResultList();
	}

}
