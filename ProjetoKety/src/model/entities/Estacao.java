package model.entities;

public class Estacao {

	private String nome;
	private String endereco;
	private Bilheteria bilheteria;

	public Estacao() {

	}

	public Estacao(String nome, String endereco, Bilheteria bilheteria) {
		this.nome = nome;
		this.endereco = endereco;
		this.bilheteria = bilheteria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Bilheteria getBilheteria() {
		return bilheteria;
	}

	public void setBilheteria(Bilheteria bilheteria) {
		this.bilheteria = bilheteria;
	}

}
