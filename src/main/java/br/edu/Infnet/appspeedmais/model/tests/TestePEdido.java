package br.edu.Infnet.appspeedmais.model.tests;

import br.edu.Infnet.appspeedmais.model.domain.Cliente;
import br.edu.Infnet.appspeedmais.model.domain.Pedido;

public class TestePEdido {
	public static void main ( String[]args) {
		
		Cliente cli = new Cliente("Osvaldo", "Rua 10", "osvcarvalho@hotmail.com");
		
		Pedido ped1 = new Pedido();
		ped1.setDescricao("Pedidão");
		ped1.setCliente(cli);
		System.out.println("Pedido: "+ ped1);
		
		
		Pedido ped2 = new Pedido("Pedido Osvaldo");
		System.out.println("Pedido: "+ ped2);
		
		
	}
	
}
