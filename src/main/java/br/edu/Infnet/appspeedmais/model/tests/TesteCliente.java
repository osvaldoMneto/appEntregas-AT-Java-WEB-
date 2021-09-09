package br.edu.Infnet.appspeedmais.model.tests;

import br.edu.Infnet.appspeedmais.model.domain.Cliente;

public class TesteCliente {
		
		public static void main( String [] args) {
			
		Cliente cli = new Cliente("Entrega rapida", "Casa 10","osvcarvalho@hotmail.com");
			System.out.println("CLiente: " + cli);
		}
	}

