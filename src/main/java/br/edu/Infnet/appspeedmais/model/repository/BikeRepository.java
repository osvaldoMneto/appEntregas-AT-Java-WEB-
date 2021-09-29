package br.edu.Infnet.appspeedmais.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.Infnet.appspeedmais.model.domain.Bike;



@Repository
public interface BikeRepository extends CrudRepository<Bike, Integer> {
	@Query("from Bike b where b.usuario.id = :userId")
	public List<Bike> obterLista(Integer userId);
}
