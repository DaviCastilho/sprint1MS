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

import com.fiap.br.model.Veiculo;
import com.fiap.br.repositories.VeiculoRepository;



@Controller
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/veiculo")
	public ModelAndView index() {

		ModelAndView model = new ModelAndView("veiculo/index");
		
		ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setIdVeiculo(1);
		veiculo1.setPlaca("GEZ-1169");
		veiculo1.setModelo("Audi");
		veiculo1.setAnoFabricacao(1992);
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setIdVeiculo(2);
		veiculo2.setPlaca("UZS-7413");
		veiculo2.setModelo("BMW");
		veiculo2.setAnoFabricacao(2010);
		
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setIdVeiculo(3);
		veiculo3.setPlaca("POX-1297");
		veiculo3.setModelo("MERCEDES");
		veiculo3.setAnoFabricacao(2019);
	
		listaVeiculos.add(veiculo1);
		listaVeiculos.add(veiculo2);
		listaVeiculos.add(veiculo3);
		
		model.addObject("listaVeiculos", listaVeiculos);
		
		return model;
	}
	
	@GetMapping("/veiculo/criar")
	public ModelAndView criar() {
		ModelAndView model = new ModelAndView("veiculo/criar");
		
		Veiculo veiculo = new Veiculo();
		model.addObject("veiculo", veiculo);
		return model;
	}
	
	@PostMapping("/veiculo/criar")
	public ModelAndView criar(@ModelAttribute("veiculo") Veiculo veiculo) {

		ModelAndView model = new ModelAndView("veiculo/index");
		
		ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setIdVeiculo(1);
		veiculo1.setPlaca("GEZ-1169");
		veiculo1.setModelo("Audi");
		veiculo1.setAnoFabricacao(1992);
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setIdVeiculo(2);
		veiculo2.setPlaca("UZS-7413");
		veiculo2.setModelo("BMW");
		veiculo2.setAnoFabricacao(2010);
		
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setIdVeiculo(3);
		veiculo3.setPlaca("POX-1297");
		veiculo3.setModelo("MERCEDES");
		veiculo3.setAnoFabricacao(2019);
	
		listaVeiculos.add(veiculo1);
		listaVeiculos.add(veiculo2);
		listaVeiculos.add(veiculo3);
		
		model.addObject("listaVeiculos", listaVeiculos);
		
		return model;
	}
	
	
	
	
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
