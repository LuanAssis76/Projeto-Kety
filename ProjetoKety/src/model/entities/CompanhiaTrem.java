package model.entities;

import java.util.ArrayList;
import java.util.List;

public class CompanhiaTrem {
	private Integer id;
	private String nome;
	private List<Trem> tipoTrem = new ArrayList<>();
	private List<Estacao> estacao = new ArrayList<>();
	private List<Empresa> empresasParceiras = new ArrayList<>();
	private List<Contrato> contrato = new ArrayList<>();

	public CompanhiaTrem() {

	}

	public CompanhiaTrem(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addTipoTrem(Trem tp) {
		tipoTrem.add(tp);
	}
	
	public void removeTipoTrem(Trem tp) {
		tipoTrem.remove(tp);
	}
	
	public void addEstacao(Estacao e) {
		estacao.add(e);
	}
	
	public void remvoeEstacao(Estacao e) {
		estacao.remove(e);
	}
	
	public void addParcerias(Empresa ep) {
		empresasParceiras.add(ep);
	}
	
	public void removeParcerias(Empresa ep) {
		empresasParceiras.remove(ep);
	}
	
	public void addContrato(Contrato c) {
		contrato.add(c);
	}
	
}
