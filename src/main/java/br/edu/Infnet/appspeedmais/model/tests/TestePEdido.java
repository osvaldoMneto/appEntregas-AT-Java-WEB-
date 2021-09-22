package br.edu.Infnet.appspeedmais.model.tests;



import br.edu.Infnet.appspeedmais.model.domain.Pedido;
import br.edu.Infnet.appspeedmais.model.domain.Solicitante;

public class TestePEdido {
	public static void main ( String[]args) {
		
		Solicitante solicitantep2 = new Solicitante("Jose","pedroa@gmail.com", 15);
		
		Pedido ped1 = new Pedido();
		ped1.setDescricao("Pedidão");
		ped1.setSolicitante(solicitantep2);
		System.out.println("Pedido: "+ ped1);
		
		
		Pedido ped2 = new Pedido("Pedido Osvaldo");
		ped2.setSolicitante(null);
		System.out.println("Pedido: "+ ped2);
		
		
	}
	
}
