package com.fiap.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.br.model.Gravacao;

@Repository
public interface GravacaoRepository extends JpaRepository<Gravacao, Long> {
	
	
}
