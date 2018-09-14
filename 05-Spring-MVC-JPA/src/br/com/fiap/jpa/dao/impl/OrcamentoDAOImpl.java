package br.com.fiap.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.fiap.jpa.dao.OrcamentoDAO;
import br.com.fiap.spring.model.Orcamento;

@Repository
public class OrcamentoDAOImpl 
			extends GenericDAOImpl<Orcamento,Integer> implements OrcamentoDAO{


}