package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table (name = "personas")
public abstract class Persona implements Serializable
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String apellido;
	private String dni;
	
	@Column (name = "fecha_alta")
	private Date fechaAlta;
	
	@Column (name = "fecha_modificacion")
	private Date fechaModificacion;
	
	private Direccion direccion;
	
	public Persona(Integer id, String nombre, String apellido, String dni, Direccion direccion) 
	{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(dni, id);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(id, other.id);
	}
	
	private static final long serialVersionUID = -1113622711526185972L;
}
