package br.edu.Infnet.appspeedmais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.Infnet.appspeedmais.model.domain.Bike;
import br.edu.Infnet.appspeedmais.model.service.BikeService;



@Component
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private BikeService bikeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Bike b1 = new Bike("Bom Estado", "Caloy");
		
		
		bikeService.incluir(b1);
		
		Bike b2 = new Bike("Pedro", "Jose");
		b2.setCor("Branca");
		b2.setDescricao("perfeito estado");

		
		bikeService.incluir(b2);

		for(Bike b :bikeService.obterLista()) {
			System.out.println(b);
		}
		
		bikeService.excluir(1);

		for(Bike b : bikeService.obterLista()) {
			System.out.println(b);
		}
		
		Bike b3 = bikeService.obterPorId(2);
		
		System.out.println(b3.getDescricao());
	}
}