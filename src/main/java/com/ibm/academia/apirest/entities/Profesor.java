package com.ibm.academia.apirest.entities;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Profesor extends Persona
{ 
	private BigDecimal sueldo; 
	
	public Profesor(Integer id, String nombre, String apellido, String dni, Direccion direccion, BigDecimal sueldo) 
	{
		super(id, nombre, apellido, dni, direccion);
		this.sueldo = sueldo;
	}

	private static final long serialVersionUID = 6212454084535480124L;

}
