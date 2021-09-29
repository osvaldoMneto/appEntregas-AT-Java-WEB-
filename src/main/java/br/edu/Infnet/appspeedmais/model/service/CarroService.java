   
package br.edu.Infnet.appspeedmais.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.Infnet.appspeedmais.model.domain.Carro;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.repository.CarroRepository;


@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;
	

	public List<Carro> obterLista(Usuario usuario) {
		return (List<Carro>) carroRepository.obterLista(usuario.getId());
	}

	public List<Carro> obterLista() {
		return (List<Carro>) carroRepository.findAll();
	}

	public void incluir(Carro carro) {
		carroRepository.save(carro);
	}

	public void excluir(Integer id) {
		carroRepository.deleteById(id);
	}

	public Carro obterPorId(Integer id) {
		return carroRepository.findById(id).orElse(null);
	}
	
	public Integer obterQtde() {

		return (int) carroRepository.count();
	}

}