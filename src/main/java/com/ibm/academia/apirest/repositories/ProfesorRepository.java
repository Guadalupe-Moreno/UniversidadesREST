package com.ibm.academia.apirest.repositories;

import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;

@Repository("repositorioProfesores")
public interface ProfesorRepository  extends PersonaRepository
{
	//@Query("select p from Profesor p where p.carrera.nombre = ?1")
	public Iterable<Persona> findProfesoresByCarrera(String carrera);
}
