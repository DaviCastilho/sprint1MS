package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Veiculo;
import com.fiap.br.repositories.VeiculoRepository;


@Controller
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/veiculo/salvar")
	public Veiculo salvar(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
	@GetMapping("/veiculo/excluir")
	public boolean excluir(Veiculo veiculo) {
		veiculoRepository.delete(veiculo);
		return true;
	}
	
	@GetMapping("/veiculo/selecionar")
	public Optional<Veiculo> selecionar(long id) {
		Optional<Veiculo> veiculo = veiculoRepository.findById(id);
		return veiculo;
	}
	
	
}
