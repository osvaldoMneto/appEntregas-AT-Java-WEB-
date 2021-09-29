package br.edu.Infnet.appspeedmais.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.Infnet.appspeedmais.model.domain.Moto;


@Repository
public interface MotoRepository extends CrudRepository<Moto, Integer> {

	@Query("from Moto m where m.usuario.id = :userId")
	public List<Moto> obterLista(Integer userId);
}