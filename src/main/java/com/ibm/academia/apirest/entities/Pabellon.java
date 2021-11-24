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
@Table (name = "pabellones")
public class Pabellon implements Serializable
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "tamano_metros")
	private Double tamanoMetros;
	
	private String nombre;
	
	@Column (name = "fecha_alta")
	private Date fechaAlta;
	
	@Column (name = "fecha_modificacion")
	private Date fechaModificacion;
	
	private Direccion direccion;

	public Pabellon(Integer id, Double tamanoMetros, String nombre, Direccion direccion) 
	{
		this.id = id;
		this.tamanoMetros = tamanoMetros;
		this.nombre = nombre;
		this.direccion = direccion;
	}

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
		Pabellon other = (Pabellon) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	private static final long serialVersionUID = 5895151497921997034L;
}
