package br.com.fiap.spring.model;

@Entity
@Table(name="T_LIVRO")
@SequenceGenerator(name="livro", sequenceName="SQ_T_LIVRO", allocationSize=1)
public class Livro {
	
	@Id
	@Column(name="cd_livro")
	@GeneratedValue(generator="livro", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_titulo")
	private String titulo;
	
	@Column(name="nr_paginas")
	private int numeroPaginas;
	
	@Column(name="st_sumario")
	private boolean sumario;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public boolean isSumario() {
		return sumario;
	}

	public void setSumario(boolean sumario) {
		this.sumario = sumario;
	}
	
	
	
}
