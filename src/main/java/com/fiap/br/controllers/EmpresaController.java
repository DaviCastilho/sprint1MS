package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.fiap.br.model.Empresa;
import com.fiap.br.repositories.EmpresaRepository;

@Controller
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/empresa/salvar")
	public Empresa salvar(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	@GetMapping("/empresa/excluir")
	public boolean excluir(Empresa empresa) {
		empresaRepository.delete(empresa);
		return true;
	}
	
	@GetMapping("/empresa/selecionar")
	public Optional<Empresa> selecionar(long id) {
		Optional<Empresa> empresa = empresaRepository.findById(id);
		return empresa;
	}
	
	
}
