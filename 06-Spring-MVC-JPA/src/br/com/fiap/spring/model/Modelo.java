package br.com.fiap.spring.model;

public enum Modelo {

	PLENO("Pleno"), JUNIOR("Junior"),SENIOR("Senior"), TRAINEE("Trainee"), ESPECIALISTA("Especialista"),GERENCIA("Gerencia"),DIRETORIA("Diretoria"),ESTAGIO("Estágio");	
	private final String label;
	
	private Modelo(String label) {
		this.label = label;
		}
		public String getLabel() {
		return label;
		}
}
