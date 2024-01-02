package model.entities;

public final class TremPassageiro extends Trem {

	private Integer capacidadePassageiros;
	private Double bagageiros;

	public TremPassageiro() {

	}

	public TremPassageiro(Integer num, String modelo, Integer potencia, Integer numVagoes, FonteEnergia fe,
			Integer capacidadePassageiros, Double bagageiros) {
		super(num, modelo, potencia, numVagoes, fe);
		this.capacidadePassageiros = capacidadePassageiros;
		this.bagageiros = bagageiros;
	}

	public Integer getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(Integer capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}

	public Double getBagageiros() {
		return bagageiros;
	}

	public void setBagageiros(Double bagageiros) {
		this.bagageiros = bagageiros;
	}

}
