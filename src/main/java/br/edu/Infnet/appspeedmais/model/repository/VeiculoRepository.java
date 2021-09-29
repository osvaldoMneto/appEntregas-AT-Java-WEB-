package br.edu.Infnet.appspeedmais.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.Infnet.appspeedmais.model.domain.Veiculo;



@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {

	@Query("from Veiculo v where v.usuario.id = :userId")
	public List<Veiculo> obterLista(Integer userId);
}
