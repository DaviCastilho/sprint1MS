package com.fiap.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filial {

	public Filial() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_filial")
	private long idFilial;
	
	@Column(name = "id_empresa")
	private long idEmpresa;
	
	@Column(name = "id_endereco")
	private long idEndereco;
	
	@Column
	private String cnpj;

	public long getIdFilial() {
		return idFilial;
	}

	public void setIdFilial(long idFilial) {
		this.idFilial = idFilial;
	}

	public long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
}
