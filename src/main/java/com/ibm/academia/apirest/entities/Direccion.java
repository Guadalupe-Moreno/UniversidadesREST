package com.ibm.academia.apirest.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Direccion implements Serializable 
{
	private String calle;
	private String numero;
	private String codigoPostal;
	private String departamento;
	private String piso;
	private String localidad;
	
	private static final long serialVersionUID = 8500313989796186076L;

}
