package br.com.fiap.spring.model;

public class Festa {
	
	private int id;
	
	private String endereco;
	
	private boolean lembrancinha;
	
	private String cardapio;
	
	private int quantidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
