package com.fiap.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.br.model.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Long> {
	
	
}
