package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Contato;
import com.fiap.br.repositories.ContatoRepository;

@Controller
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/contato/salvar")
	public Contato salvar(Contato contato) {
		return contatoRepository.save(contato);
	}
	
	@GetMapping("/contato/excluir")
	public boolean excluir(Contato empresa) {
		contatoRepository.delete(empresa);
		return true;
	}
	
	@GetMapping("/contato/selecionar")
	public Optional<Contato> selecionar(long id) {
		Optional<Contato> contato = contatoRepository.findById(id);
		return contato;
	}
	
	
}
