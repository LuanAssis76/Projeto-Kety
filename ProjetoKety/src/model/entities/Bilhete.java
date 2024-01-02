package model.entities;

import java.time.LocalDateTime;

import model.services.ServicoPagamento;

public class Bilhete {
	private static Integer nextID = 1;
	private Integer id;
	private String estacaoPartida; // troquei o tipo de estacao de partida e de chegada pq na minha cabeça n faz
								   // sentido elas serem do tipo estacao
	private String estacaoChegada;
	private ServicoPagamento sp;
	private LocalDateTime dataCompra;
	private LocalDateTime dataPartida;

	public Bilhete() {
		
	}

	public Bilhete(Integer id, String estacaoPartida, String estacaoChegada, ServicoPagamento sp,
			LocalDateTime dataCompra, LocalDateTime dataPartida) {
		this.id = ++nextID;
		this.estacaoPartida = estacaoPartida;
		this.estacaoChegada = estacaoChegada;
		this.sp = sp;
		this.dataCompra = dataCompra;
		this.dataPartida = dataPartida;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstacaoPartida() {
		return estacaoPartida;
	}

	public void setEstacaoPartida(String estacaoPartida) {
		this.estacaoPartida = estacaoPartida;
	}

	public String getEstacaoChegada() {
		return estacaoChegada;
	}

	public void setEstacaoChegada(String estacaoChegada) {
		this.estacaoChegada = estacaoChegada;
	}

	public ServicoPagamento getSp() {
		return sp;
	}

	public void setSp(ServicoPagamento sp) {
		this.sp = sp;
	}

	public LocalDateTime getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDateTime dataCompra) {
		this.dataCompra = dataCompra;
	}

	public LocalDateTime getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(LocalDateTime dataPartida) {
		this.dataPartida = dataPartida;
	}

}
