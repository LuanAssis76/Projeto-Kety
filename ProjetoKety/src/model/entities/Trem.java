package model.entities;

public class Trem {
	private Integer num;
	private String modelo;
	private Integer potencia;
	private Integer numVagoes;
	private FonteEnergia fe;

	public Trem() {

	}

	public Trem(Integer num, String modelo, Integer potencia, Integer numVagoes, FonteEnergia fe) {
		super();
		this.num = num;
		this.modelo = modelo;
		this.potencia = potencia;
		this.numVagoes = numVagoes;
		this.fe = fe;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getNumVagoes() {
		return numVagoes;
	}

	public void setNumVagoes(Integer numVagoes) {
		this.numVagoes = numVagoes;
	}

	public FonteEnergia getFe() {
		return fe;
	}

	public void setFe(FonteEnergia fe) {
		this.fe = fe;
	}

}
