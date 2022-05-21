package com.fiap.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.br.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
	
	
	
}
