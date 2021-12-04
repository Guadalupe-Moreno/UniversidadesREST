package com.ibm.academia.apirest.repositories;

import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.enums.TipoEmpleado;

@Repository("repositorioEmpleados")
public interface EmpleadoRepository extends PersonaRepository
{
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);
}
