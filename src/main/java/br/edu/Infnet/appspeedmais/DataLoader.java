package br.edu.Infnet.appspeedmais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.service.UsuarioService;



@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setNome("OsvaldoCarvalho");
		usuario.setEmail("osvaldocarvalhont@gmail.com");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		
		usuarioService.incluir(usuario);
		
		System.out.println("Inclusão realizada!!!");
	}
}
