package br.edu.Infnet.appspeedmais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.Infnet.appspeedmais.model.domain.Bike;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.service.BikeService;


@Controller
public class BikeController {
	
	@Autowired
	private BikeService bikeService;

	@GetMapping(value = "/bike/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("bikes", bikeService.obterLista());
		
		return "bike/lista";
	}	
	
	@GetMapping(value = "/bike")
	public String telaCadastro() {
		return "bike/cadastro";
	}
	
	@PostMapping(value = "/bike/incluir")
	public String incluir(Model model, Bike bike, @SessionAttribute("user") Usuario usuario) {
		
		bike.setUsuario(usuario);
		
		bikeService.incluir(bike);
		
		model.addAttribute("msg", "Bike " + bike.getDescricao() + " cadastrada com sucesso!!!");
		
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/bike/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Bike bike= bikeService.obterPorId(id);
		
		
		
		String mensagem = null;
		
		try {
		bikeService.excluir(id);
		
		mensagem  = "A Bike"+ bike.getDescricao() + " foi removida com sucesso!!!";
		
		}catch( Exception e) {
			mensagem= " Foi impossível realizar a exclusão da bike"+ bike.getDescricao();
		}
		
		model.getAttribute(mensagem);
		
		return telaLista(model,usuario);
	}
}