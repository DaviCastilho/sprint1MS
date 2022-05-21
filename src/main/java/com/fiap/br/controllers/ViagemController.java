package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Viagem;
import com.fiap.br.repositories.ViagemRepository;


@Controller
public class ViagemController {

	@Autowired
	private ViagemRepository viagemRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/viagem/salvar")
	public Viagem salvar(Viagem viagem) {
		return viagemRepository.save(viagem);
	}
	
	@GetMapping("/viagem/excluir")
	public boolean excluir(Viagem viagem) {
		viagemRepository.delete(viagem);
		return true;
	}
	
	@GetMapping("/viagem/selecionar")
	public Optional<Viagem> selecionar(long id) {
		Optional<Viagem> viagem = viagemRepository.findById(id);
		return viagem;
	}
	
	
}
