package com.ibm.academia.apirest.entities;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Alumno extends Persona
{
	public Alumno(Integer id, String nombre, String apellido, String dni, Direccion direccion) 
	{
		super(id, nombre, apellido, dni, direccion);
	}

	private static final long serialVersionUID = 282135527639709536L;

}
