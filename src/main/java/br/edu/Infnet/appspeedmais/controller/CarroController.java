package br.edu.Infnet.appspeedmais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.Infnet.appspeedmais.model.domain.Carro;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.service.CarroService;


@Controller
public class CarroController {
	
	@Autowired
	private CarroService carroService;

	@GetMapping(value = "/carro/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("carros", carroService.obterLista(usuario));
		
		return "carro/lista";
	}	
	
	@GetMapping(value = "/carro")
	public String telaCadastro() {
		return "carro/cadastro";
	}
	
	@PostMapping(value = "/carro/incluir")
	public String incluir(Model model, Carro carro, @SessionAttribute("user") Usuario usuario) {
		
		carro.setUsuario(usuario);
		
		carroService.incluir(carro);
		
		model.addAttribute("msg", "Carro " + carro.getDescricao() + " cadastrado com sucesso!!!");
		
		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/carro/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Carro carro = carroService.obterPorId(id);
		
		String mensagem = null;
		try {
			carroService.excluir(id);		
			mensagem = "O carro " + carro.getDescricao() + " foi removida com sucesso!!!";
		} catch (Exception e) {
			mensagem = "Foi impossível realizar a exclusão do carro "+ carro.getDescricao();
		}
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}
}