package br.edu.Infnet.appspeedmais.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.domain.Veiculo;
import br.edu.Infnet.appspeedmais.model.repository.VeiculoRepository;




@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	public List<Veiculo> obterLista(Usuario usuario){
		return (List<Veiculo>) veiculoRepository.obterLista(usuario.getId());
	}
	public List<Veiculo> obterLista(){
		return (List<Veiculo>) veiculoRepository.findAll();
	}

	public void excluir(Integer id) {
		veiculoRepository.deleteById(id);
	}
	
	public Veiculo obterPorId(Integer id) {
		return veiculoRepository.findById(id).orElse(null);
	}

	public Integer obterQtde() {

		return (int) veiculoRepository.count();
	}

}