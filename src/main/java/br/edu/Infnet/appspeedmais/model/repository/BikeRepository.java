package br.edu.Infnet.appspeedmais.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.Infnet.appspeedmais.model.domain.Bike;


@Repository
public interface BikeRepository extends CrudRepository<Bike, Integer> {

}
