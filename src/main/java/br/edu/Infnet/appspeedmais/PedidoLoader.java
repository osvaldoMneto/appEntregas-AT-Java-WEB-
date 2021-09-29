package br.edu.Infnet.appspeedmais;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.Infnet.appspeedmais.model.domain.Bike;
import br.edu.Infnet.appspeedmais.model.domain.Carro;
import br.edu.Infnet.appspeedmais.model.domain.Moto;
import br.edu.Infnet.appspeedmais.model.domain.Pedido;
import br.edu.Infnet.appspeedmais.model.domain.Solicitante;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.domain.Veiculo;
import br.edu.Infnet.appspeedmais.model.service.PedidoService;






@Component
@Order(4)
public class PedidoLoader implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Solicitante solicitante = new Solicitante();
		solicitante.setId(1);

		Bike b1 = new Bike();
		b1.setId(1);

		Carro c1 = new Carro();
		c1.setId(2);
		
		Moto m1 = new Moto();
		m1.setId(3);
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(b1);
		veiculos.add(c1);
		veiculos.add(m1);
		
		Pedido pedido = new Pedido();
		pedido.setSolicitante(solicitante);
		pedido.setVeiculos(veiculos);
		pedido.setDescricao("Meu pedido especial");
		pedido.setUsuario(usuario);
		
		
		pedidoService.incluir(pedido);
	}
}