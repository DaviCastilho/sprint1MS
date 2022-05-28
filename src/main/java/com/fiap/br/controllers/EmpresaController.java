package com.fiap.br.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.br.model.Empresa;
import com.fiap.br.repositories.EmpresaRepository;

@Controller
public class EmpresaController {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@GetMapping("/empresa/index")
	public ModelAndView index() {

		ModelAndView model = new ModelAndView("veiculo/index");
		
		ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();
		
		Empresa empresa1 = new Empresa();
		empresa1.setIdEmpresa(1);
		empresa1.setNomeFantasia("Scania");
		empresa1.setCnpj("11.472.179/0001-04");
		
		Empresa empresa2 = new Empresa();
		empresa2.setIdEmpresa(2);
		empresa2.setNomeFantasia("Google");
		empresa2.setCnpj("68.846.186/0001-38");
		
		Empresa empresa3= new Empresa();
		empresa3.setIdEmpresa(3);
		empresa3.setNomeFantasia("Microsoft");
		empresa3.setCnpj("79.517.273/0001-68");
	
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
		
		model.addObject("listaEmpresas", listaEmpresas);
		
		return model;
	}
	
	@GetMapping("/empresa/criar")
	public ModelAndView criar() {
		ModelAndView model = new ModelAndView("empresa/criar");
		
		Empresa empresa = new Empresa();
		model.addObject("empresa", empresa);
		return model;
	}
	

	@PostMapping("/empresa/criar")
	public ModelAndView criar(@ModelAttribute("empresa") Empresa empresa) {

		ModelAndView model = new ModelAndView("empresa/index");
		
		ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();
		
		Empresa empresa1 = new Empresa();
		empresa1.setIdEmpresa(1);
		empresa1.setNomeFantasia("Scania");
		empresa1.setCnpj("11.472.179/0001-04");
		
		Empresa empresa2 = new Empresa();
		empresa2.setIdEmpresa(2);
		empresa2.setNomeFantasia("Google");
		empresa2.setCnpj("68.846.186/0001-38");
		
		Empresa empresa3= new Empresa();
		empresa3.setIdEmpresa(3);
		empresa3.setNomeFantasia("Microsoft");
		empresa3.setCnpj("79.517.273/0001-68");
	
		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
		
		model.addObject("listaEmpresas", listaEmpresas);
		
		return model;
	}
	
	
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
