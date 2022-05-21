package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Perfil;
import com.fiap.br.repositories.PerfilRepository;

@Controller
public class PerfilController {

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/perfil/salvar")
	public Perfil salvar(Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	@GetMapping("/perfil/excluir")
	public boolean excluir(Perfil perfil) {
		perfilRepository.delete(perfil);
		return true;
	}
	
	@GetMapping("/perfil/selecionar")
	public Optional<Perfil> selecionar(long id) {
		Optional<Perfil> perfil = perfilRepository.findById(id);
		return perfil;
	}
	
	
}
