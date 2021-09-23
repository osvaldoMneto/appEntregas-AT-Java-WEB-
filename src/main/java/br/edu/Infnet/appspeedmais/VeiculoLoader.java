package br.edu.Infnet.appspeedmais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.Infnet.appspeedmais.model.domain.Bike;
import br.edu.Infnet.appspeedmais.model.domain.Carro;
import br.edu.Infnet.appspeedmais.model.domain.Moto;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.service.BikeService;
import br.edu.Infnet.appspeedmais.model.service.CarroService;
import br.edu.Infnet.appspeedmais.model.service.MotoService;



@Component
public class VeiculoLoader implements ApplicationRunner {
	
		private MotoService motoService;
		@Autowired
		private BikeService bikeService;
		@Autowired
		private CarroService carroService;

		@Override
		public void run(ApplicationArguments args) throws Exception {
			
			Usuario usuario = new Usuario();
			usuario.setId(1);

			Bike b1 = new Bike();
			
			b1.setMarca("Caloy");
			b1.setCondutor("Raimundo");
			b1.setUsuario(usuario);
		
			bikeService.incluir(b1);

			Carro c1 = new Carro("Fiesta", "Preto", "Chevrolet", "2010");
			c1.setAirberg(false);
			c1.setCondutor("Pedro José");
			c1.setUsuario(usuario);
			
			carroService.incluir(c1);
			
			Moto m1 = new Moto("Titan", "Azul","Joao Agripino", "2010");
			m1.setCilindradas(150);
			m1.getCondutor();
			m1.setUsuario(usuario);
			
			motoService.incluir(m1);
		}
	}
	