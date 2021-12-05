package com.ibm.academia.apirest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.enums.Pizarron;

@Repository
public interface AulaRepository extends CrudRepository<Aula, Integer>
{
	@Query("select a from Aula a where a.numeroAula = ?1")
	public Optional<Aula> buscarPorAula(Integer numeroAula);
	
	@Query("select a from Aula a where a.pizarron like %?1%")
	public Iterable<Aula> buscarPorPizarron(Pizarron pizarron);
	
	
}
