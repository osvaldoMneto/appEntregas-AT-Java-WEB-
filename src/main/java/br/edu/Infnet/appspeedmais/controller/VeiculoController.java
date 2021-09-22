package br.edu.Infnet.appspeedmais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.domain.Veiculo;
import br.edu.Infnet.appspeedmais.model.service.VeiculoService;


@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;

	@GetMapping(value = "/veiculo/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("veiculos", veiculoService.obterLista(usuario));
		
		return "veiculo/lista";
	}	

	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
		
		Veiculo veiculo = veiculoService.obterPorId(id);
		
		String mensagem = null;
		try {
			veiculoService.excluir(id);		
			mensagem = "O produto " + veiculo.getDescricao() + " foi removido com sucesso!!!";
		} catch (Exception e) {
			mensagem = "Foi impossível realizar a exclusão do  "+ veiculo.getDescricao();
		}
		model.addAttribute("msg", mensagem);
		
		return telaLista(model, usuario);
	}
}