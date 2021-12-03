package com.ibm.academia.apirest.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.services.CarreraDAO;

@Component
public class Comandos implements CommandLineRunner
{
	@Autowired
	private CarreraDAO carreraDao;

	@Override
	public void run(String... args) throws Exception {
		Carrera finanzas = new Carrera(null, "Ingenieria en finanzas", 20, 3);
		Carrera carreraGuardada = carreraDao.guardar(finanzas);
		System.out.println(carreraGuardada.toString());
	}

}
