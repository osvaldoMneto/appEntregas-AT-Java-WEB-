package br.edu.Infnet.appspeedmais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.Infnet.appspeedmais.model.domain.Moto;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.service.MotoService;



@Controller
public class MotoController {
	
	@Autowired
	private MotoService motoService;

	
	
	@GetMapping(value = "/moto/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("motos", motoService.obterLista());

		return "moto/lista";
	}

	@GetMapping(value = "/moto")
	public String telaCadastro() {
		return "moto/cadastro";
	}
	
	@PostMapping(value = "/moto/incluir")
	public String incluir(Model model, Moto moto, @SessionAttribute("user") Usuario usuario) {

		moto.setUsuario(usuario);
		
		motoService.incluir(moto);
		
		String mensagem = " A moto "+ moto.getDescricao() +" foi cadastrada com sucesso!!!";
		
		model.addAttribute("msg", mensagem);

		return telaLista(model, usuario);
	}	
	
	@GetMapping(value = "/moto/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

		Moto moto = motoService.obterPorId(id);
				
				String mensagem = null;
				try {
						motoService.excluir(id);		
					mensagem = "A moto " + moto.getDescricao() + " foi removida com sucesso!!!";
				} catch (Exception e) {
					mensagem = "Foi impossível realizar a exclusão da moto "+ moto.getDescricao();
				}
				model.addAttribute("msg", mensagem);
				
				return telaLista(model, usuario);
	}
}