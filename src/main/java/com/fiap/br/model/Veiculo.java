package com.fiap.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {

	public Veiculo() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_veiculo")
	private long idVeiculo;
	
	@Column
	private String placa;

	@Column
	private String modelo;
	
	@Column(name = "ano_fabricacao")
	private int anoFabricacao;
	
	@Column(name = "id_dipositivo")
	private long idDispositivo;

	public long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public long getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(long idDispositivo) {
		this.idDispositivo = idDispositivo;
	}
	
	
	
}
