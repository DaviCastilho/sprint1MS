package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Gravacao;
import com.fiap.br.repositories.GravacaoRepository;

@Controller
public class GravacaoController {

	@Autowired
	private GravacaoRepository gravacaoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/gravacao/salvar")
	public Gravacao salvar(Gravacao gravacao) {
		return gravacaoRepository.save(gravacao);
	}
	
	@GetMapping("/gravacao/excluir")
	public boolean excluir(Gravacao gravacao) {
		gravacaoRepository.delete(gravacao);
		return true;
	}
	
	@GetMapping("/gravacao/selecionar")
	public Optional<Gravacao> selecionar(long id) {
		Optional<Gravacao> gravacao = gravacaoRepository.findById(id);
		return gravacao;
	}
	
	
}
