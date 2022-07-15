package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")

@NamedQueries({
		@NamedQuery(name = "Estudiante.buscarPorGenero", query = "SELECT e FROM Estudiante e WHERE e.genero = :datoGenero ORDER BY e.apellido"),
		@NamedQuery(name = "Estudiante.buscarPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre ORDER BY e.id")
		})

@NamedNativeQueries({
	@NamedNativeQuery(name = "Estudiante.buscarNombreApellido", query = "SELECT * FROM estudiante WHERE estu_nombre = :datoNombre AND estu_apellido = :datoApellido", resultClass = Estudiante.class),
	@NamedNativeQuery(name = "Estudiante.buscarPorSemestre", query = "SELECT * FROM estudiante WHERE estu_semestre = :datoSemestre ORDER BY estu_cedula",resultClass = Estudiante.class )
	 })

public class Estudiante {
	@Id
	@Column(name = "estu_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_id_seq")
	@SequenceGenerator(name = "estu_id_seq", sequenceName = "estu_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "estu_nombre")
	private String nombre;
	@Column(name = "estu_apellido")
	private String apellido;
	@Column(name = "estu_cedula")
	private String cedula;
	@Column(name = "estu_genero")
	private String genero;
	@Column(name = "estu_semestre")
	private String semestre;



	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", genero=" + genero + ", semestre=" + semestre + "]";
	}

	// GET Y SET
	public String getNombre() {
		return nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	
	

}
