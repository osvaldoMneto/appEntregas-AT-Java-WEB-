package br.edu.Infnet.appspeedmais.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.service.BikeService;
import br.edu.Infnet.appspeedmais.model.service.CarroService;
import br.edu.Infnet.appspeedmais.model.service.MotoService;
import br.edu.Infnet.appspeedmais.model.service.PedidoService;
import br.edu.Infnet.appspeedmais.model.service.SolicitanteService;
import br.edu.Infnet.appspeedmais.model.service.UsuarioService;
import br.edu.Infnet.appspeedmais.model.service.VeiculoService;



@SessionAttributes("user")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@Autowired
	private VeiculoService veiculoService;
	
	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private CarroService carroService;
	@Autowired
	private BikeService bikeService;
	
	@Autowired
	private MotoService  motoService;

	@GetMapping(value = "/app")
	public String telaApp(Model model) {
		
		Map<String, Integer>mapTotal = new HashMap<String, Integer>();
		
		mapTotal.put("Usuarios", usuarioService.obterQtde());
		mapTotal.put("Solcitantes", solicitanteService.obterQtde());
		mapTotal.put("Pedidos", pedidoService.obterQtde());
		mapTotal.put("veiculos", veiculoService.obterQtde());
		mapTotal.put("Carros", carroService.obterQtde());
		mapTotal.put("bike", bikeService.obterQtde());
		mapTotal.put("moto", motoService.obterQtde());
			
		
		model.addAttribute("totalizacao", mapTotal);
		
		return "app";
		
		
	}
	
	@GetMapping(value = "/")
	public String telaHome() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}

	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}

	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario usuario = usuarioService.validar(email, senha);

		if(usuario != null) {
			
			model.addAttribute("user", usuario);

			return "index";
		} else {
			model.addAttribute("mensagem", "Autenticação inválida para o usuário "+ email +"!!!");
			
			return "login";
		}
	}
}



