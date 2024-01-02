package model.entities;

public final class TremCarga extends Trem {

	private Double capacidadeCarga;
	private Double cargaDisponivel;

	public TremCarga() {

	}

	public TremCarga(Integer num, String modelo, Integer potencia, Integer numVagoes, FonteEnergia fe,
			Double capacidadeCarga, Double cargaDisponivel) {
		super(num, modelo, potencia, numVagoes, fe);
		this.capacidadeCarga = capacidadeCarga;
		this.cargaDisponivel = cargaDisponivel;
	}

	public Double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(Double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public Double getCargaDisponivel() {
		return cargaDisponivel;
	}

	public void setCargaDisponivel(Double cargaDisponivel) {
		this.cargaDisponivel = cargaDisponivel;
	}

}
