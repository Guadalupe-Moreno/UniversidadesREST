package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.enums.Pizarron;
import com.ibm.academia.apirest.repositories.AulaRepository;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO
{
	@Autowired
	public AulaDAOImpl(AulaRepository repository) {
		super(repository);
	}

	@Override
	public Optional<Aula> buscarPorAula(Integer numeroAula) {
		return repository.buscarPorAula(numeroAula);
	}
	
	@Override
	public Iterable<Aula> buscarPorPizarron(Pizarron pizarron) {
		return  repository.buscarPorPizarron(pizarron);
	}
	
}
