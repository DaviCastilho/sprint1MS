package com.fiap.br.dto;

public class Veiculo {
	
	private long idVeiculo;
	private String placa;
	private String modelo;
	private int anoFabricacao;
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
