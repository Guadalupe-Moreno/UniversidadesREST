package com.ibm.academia.apirest.repositories;

import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;

@Repository("repositorioEmpleados")
public interface EmpleadoRepository extends PersonaRepository
{
	//@Query("select c from Empleado c where c.tipoEmpleado like %?1%");
	public Iterable<Persona> findEmpleadoByTipoEmpleado(String tipoEmpleado);
}
