package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Dispositivo;
import com.fiap.br.repositories.DispositivoRepository;

@Controller
public class DispositivoController {

	@Autowired
	private DispositivoRepository dispositivoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/dispositivo/salvar")
	public Dispositivo salvar(Dispositivo dispositivo) {
		return dispositivoRepository.save(dispositivo);
	}
	
	@GetMapping("/dispositivo/excluir")
	public boolean excluir(Dispositivo dispositivo) {
		dispositivoRepository.delete(dispositivo);
		return true;
	}
	
	@GetMapping("/dispositivo/selecionar")
	public Optional<Dispositivo> selecionar(long id) {
		Optional<Dispositivo> dispositivo = dispositivoRepository.findById(id);
		return dispositivo;
	}
	
	
}
