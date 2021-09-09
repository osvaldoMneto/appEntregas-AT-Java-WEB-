package br.edu.Infnet.appspeedmais.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.Infnet.appspeedmais.model.domain.Aluno;



@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

	@Query("from Aluno a where a.usuario.id = :userId")
	public List<Aluno> obterLista(Integer userId);
}