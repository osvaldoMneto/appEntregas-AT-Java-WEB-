package br.edu.Infnet.appspeedmais.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.Infnet.appspeedmais.model.domain.Bike;
import br.edu.Infnet.appspeedmais.model.domain.Usuario;
import br.edu.Infnet.appspeedmais.model.repository.BikeRepository;


@Service
public class BikeService {
	
	@Autowired
	private BikeRepository bikeRepository;
	
	public List<Bike> obterLista(Usuario usuario){
		return (List<Bike>) bikeRepository.obterLista(usuario.getId());	
	}
	

	public List<Bike> obterLista(){
		return (List<Bike>) bikeRepository.findAll();
	}
	
	public void incluir(Bike bike) {
		bikeRepository.save(bike);
	}
	
	public void excluir(Integer id) {
		bikeRepository.deleteById(id);
	}
	
	public Bike obterPorId(Integer id) {

		return bikeRepository.findById(id).orElse(null);
		}
	public Integer obterQtde() {
		
		return (int) bikeRepository.count();
	}	
	
	
	}
