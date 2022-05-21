package com.fiap.br.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fiap.br.model.Usuario;
import com.fiap.br.repositories.UsuarioRepository;


@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/usuario/salvar")
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@GetMapping("/usuario/excluir")
	public boolean excluir(Usuario usuario) {
		usuarioRepository.delete(usuario);
		return true;
	}
	
	@GetMapping("/usuario/selecionar")
	public Optional<Usuario> selecionar(long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		return usuario;
	}
	
	
}
