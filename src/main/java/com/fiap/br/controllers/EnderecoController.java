package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Endereco;
import com.fiap.br.repositories.EnderecoRepository;

@Controller
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/endereco/salvar")
	public Endereco salvar(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	@GetMapping("/endereco/excluir")
	public boolean excluir(Endereco endereco) {
		enderecoRepository.delete(endereco);
		return true;
	}
	
	@GetMapping("/endereco/selecionar")
	public Optional<Endereco> selecionar(long id) {
		Optional<Endereco> endereco = enderecoRepository.findById(id);
		return endereco;
	}
	
	
}
