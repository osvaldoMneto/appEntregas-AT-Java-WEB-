package br.edu.Infnet.appspeedmais.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.edu.Infnet.appspeedmais.model.domain.Moto;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.repository.MotoRepository;



@Service
public class MotoService {
	
	@Autowired
	private MotoRepository motoRepository;

	
	public List<Moto> obterLista(Usuario usuario){
		return motoRepository.obterLista(usuario.getId());
	}
	
	public List<Moto> obterLista(){

		return (List<Moto>) motoRepository.findAll();
	}
		
	public void incluir(Moto moto) {

		motoRepository.save(moto);
	}
	
	public void excluir(Integer id) {
		motoRepository.deleteById(id);
	}
	
	public Moto obterPorId(Integer id) {
		return motoRepository.findById(id).orElse(null);
	}
}
