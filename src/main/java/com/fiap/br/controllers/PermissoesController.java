package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Permissoes;
import com.fiap.br.repositories.PermissoesRepository;


@Controller
public class PermissoesController {

	@Autowired
	private PermissoesRepository permissoesRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/permissoes/salvar")
	public Permissoes salvar(Permissoes permissoes) {
		return permissoesRepository.save(permissoes);
	}
	
	@GetMapping("/permissoes/excluir")
	public boolean excluir(Permissoes permissoes) {
		permissoesRepository.delete(permissoes);
		return true;
	}
	
	@GetMapping("/permissoes/selecionar")
	public Optional<Permissoes> selecionar(long id) {
		Optional<Permissoes> permissoes = permissoesRepository.findById(id);
		return permissoes;
	}
	
	
}
