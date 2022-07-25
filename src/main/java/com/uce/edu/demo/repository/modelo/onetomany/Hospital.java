package com.uce.edu.demo.repository.modelo.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "hospital")
public class Hospital {
	
	@Id
	@Column(name= "hosp_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hosp_id_seq")
	@SequenceGenerator(name = "hosp_id_seq", sequenceName = "hosp_id_seq", allocationSize = 1)
	private Integer id;
	
	
	
	
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	// GET Y SET
	@Column(name = "hosp_nombre")
	private String nombre;
	
	@Column(name = "hosp_direccion")
	private String direccion;
	
	@OneToMany(mappedBy = "hospital")
	private List<Doctor> doctores;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Doctor> getDoctores() {
		return doctores;
	}

	public void setDoctores(List<Doctor> doctores) {
		this.doctores = doctores;
	}

	
	
	
	

}
