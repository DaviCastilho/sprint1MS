package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Empresa;
import com.fiap.br.model.Filial;
import com.fiap.br.repositories.FilialRepository;

@Controller
public class FilialController {

	@Autowired
	private FilialRepository filialRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/filial/salvar")
	public Filial salvar(Filial filial) {
		return filialRepository.save(filial);
	}
	
	@GetMapping("/filial/excluir")
	public boolean excluir(Filial filial) {
		filialRepository.delete(filial);
		return true;
	}
	
	@GetMapping("/filial/selecionar")
	public Optional<Filial> selecionar(long id) {
		Optional<Filial> filial = filialRepository.findById(id);
		return filial;
	}
	
	
}
