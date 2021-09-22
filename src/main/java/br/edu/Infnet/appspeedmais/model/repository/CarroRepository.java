package br.edu.Infnet.appspeedmais.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.Infnet.appspeedmais.model.domain.Carro;



@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {

	@Query("from Comida c where c.usuario.id = :userId")
	public List<Carro> obterLista(Integer userId);
}