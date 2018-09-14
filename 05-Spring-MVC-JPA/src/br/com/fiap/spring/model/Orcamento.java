package br.com.fiap.spring.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T_ORCAMENTO")
@SequenceGenerator(name="orcamento",sequenceName="SQ_T_ORCAMENTO",allocationSize=1)
public class Orcamento {
	
	@Id
	@Column(name="cd_orcamento")
	@GeneratedValue(generator="orcamento",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="vl_preco")
	private double valor;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="dt_orcamento")
	private Calendar data;
	
	@Column(name="ds_orcamento")
	private String descricao;
	
	private boolean aprovado;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	
	
}
