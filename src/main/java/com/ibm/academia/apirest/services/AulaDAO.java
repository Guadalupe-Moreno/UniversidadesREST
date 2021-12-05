package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.enums.Pizarron;

public interface AulaDAO extends GenericoDAO<Aula>
{
	public Optional<Aula> buscarPorAula(Integer numeroAula);
	public Iterable<Aula> buscarPorPizarron(Pizarron pizarron);
}
