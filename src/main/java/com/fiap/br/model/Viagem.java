package com.fiap.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Viagem {

	public Viagem() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_viagem")
	private long idViagem;
	
	@Column
	private String destino;
	
	@Column
	private String origem;

	@Column(name = "id_motoristaXveiculo")
	private long idMotoristaXVeiculo;
	
	public long getIdViagem() {
		return idViagem;
	}

	public void setIdViagem(long idViagem) {
		this.idViagem = idViagem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
}
