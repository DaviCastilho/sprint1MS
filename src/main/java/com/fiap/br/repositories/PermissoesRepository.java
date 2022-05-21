package com.fiap.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.br.model.Permissoes;

@Repository
public interface PermissoesRepository extends JpaRepository<Permissoes, Long> {
	
	
}
