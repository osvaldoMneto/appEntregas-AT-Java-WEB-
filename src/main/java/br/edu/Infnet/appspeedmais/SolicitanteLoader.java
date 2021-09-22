package br.edu.Infnet.appspeedmais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.Infnet.appspeedmais.model.domain.Solicitante;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.service.SolicitanteService;



@Component
@Order(2)
public class SolicitanteLoader implements ApplicationRunner {

	@Autowired
	private SolicitanteService solicitanteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Solicitante solicitante = new Solicitante("Joaozinho", "joao@joao.com", 71);
		solicitante.setUsuario(usuario);
		
		solicitanteService.incluir(solicitante);
	}
}
