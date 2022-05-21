package com.fiap.br.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gravacao {

	public Gravacao() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_gravacao")
	private long idGravacao;
	
	@Column(name = "caminho_arquivo")
	private String caminhoArquivo;
	
	@Column
	private Date data;
	
	@Column(name = "id_viagem")
	private long idViagem;

	public long getIdGravacao() {
		return idGravacao;
	}

	public void setIdGravacao(long idGravacao) {
		this.idGravacao = idGravacao;
	}

	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}

	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public long getIdViagem() {
		return idViagem;
	}

	public void setIdViagem(long idViagem) {
		this.idViagem = idViagem;
	}
	

	
	
}
