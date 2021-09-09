package br.edu.Infnet.appspeedmais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.Infnet.appspeedmais.model.domain.Bike;
import br.edu.Infnet.appspeedmais.model.service.BikeService;


@Controller
public class BikeController {
	
	@Autowired
	private BikeService bikeService;

	@GetMapping(value = "/bike/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("bikes", bikeService.obterLista());
		
		return "bike/lista";
	}	
	
	@GetMapping(value = "/bike")
	public String telaCadastro() {
		return "bike/cadastro";
	}
	
	@PostMapping(value = "/bike/incluir")
	public String incluir(Model model, Bike bike) {
		
		bikeService.incluir(bike);
		
		model.addAttribute("msg", "Bike " + bike.getDescricao() + " cadastrada com sucesso!!!");
		
		return telaLista(model);
	}
	
	@GetMapping(value = "/bike/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		
		Bike bike= bikeService.obterPorId(id);
		
		bikeService.excluir(id);
		
		model.addAttribute("msg", "Bike " + bike.getDescricao() + " removida com sucesso!!!");
		
		return telaLista(model);
	}
}