package com.fiap.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dispositivo {

	public Dispositivo() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dispositivo")
	private long idDispositivo;
	
	@Column(name = "numero_serie")
	private long numeroSerie;
	
	@Column(name = "ano_fabricacao")
	private long anoFabricacao;

	public long getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(long idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public long getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public long getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	
	
}
