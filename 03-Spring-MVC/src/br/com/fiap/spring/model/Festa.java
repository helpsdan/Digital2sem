package br.com.fiap.spring.model;

public class Festa {

	private int id;
	private int qtdPessoas;
	private String endereco;
	private boolean lembrancinha;
	private String cardapio;
	
	public Festa(int qtdPessoas, String endereco, boolean lembrancinha, String cardapio) {
		super();
		this.qtdPessoas = qtdPessoas;
		this.endereco = endereco;
		this.lembrancinha = lembrancinha;
		this.cardapio = cardapio;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isLembrancinha() {
		return lembrancinha;
	}

	public void setLembrancinha(boolean lembrancinha) {
		this.lembrancinha = lembrancinha;
	}

	public String getCardapio() {
		return cardapio;
	}

	public void setCardapio(String cardapio) {
		this.cardapio = cardapio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
