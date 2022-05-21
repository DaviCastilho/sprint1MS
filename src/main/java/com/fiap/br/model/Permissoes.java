package com.fiap.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Permissoes {

	public Permissoes() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_permissoes")
	private long idPermissoes;
	
	@Column
	private String descricao;

	
	public long getIdPermissoes() {
		return idPermissoes;
	}

	public void setIdPermissoes(long idPermissoes) {
		this.idPermissoes = idPermissoes;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
