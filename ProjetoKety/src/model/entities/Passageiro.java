package model.entities;

public class Passageiro {
	private String nome;
	private String rg;
	private Integer idade;

	public Passageiro() {
		
	}

	public Passageiro(String nome, String rg, Integer idade) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
