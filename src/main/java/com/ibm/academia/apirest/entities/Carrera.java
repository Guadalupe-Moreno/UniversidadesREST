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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table (name = "carreras")
public class Carrera implements Serializable
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	
	@Column (name = "cantidad_materias")
	private Integer cantidadMaterias;
	
	@Column (name = "cantidad_anios")
	private Integer cantidadAnios;
	
	@Column (name = "fecha_alta")
	private Date fechaAlta;
	
	@Column (name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(id, nombre);
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
		Carrera other = (Carrera) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	private static final long serialVersionUID = 7386711690996525949L;

}
