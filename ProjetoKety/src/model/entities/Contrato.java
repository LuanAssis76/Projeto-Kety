package model.entities;

import java.time.LocalDate;

public class Contrato {
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Double orcamento;
	private String tipoCarga;

	public Contrato() {
		
	}

	public Contrato(LocalDate dataInicio, LocalDate dataFim, Double orcamento, String tipoCarga) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.orcamento = orcamento;
		this.tipoCarga = tipoCarga;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

}
