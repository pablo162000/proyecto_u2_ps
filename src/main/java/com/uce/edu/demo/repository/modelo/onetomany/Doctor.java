package com.uce.edu.demo.repository.modelo.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doct_id_seq")
	@SequenceGenerator(name = "doct_id_seq", sequenceName = "doct_id_seq", allocationSize = 1)
	@Column(name =  "doct_id")
	private Integer id;
	
	@Column(name = "doct_nombre")
	private String nombre;
	
	@Column(name = "doct_direccion")
	private String apellido;
	
	@Column(name = "doct_cedula")
	private String cedula;
	
	@ManyToOne
	@JoinColumn(name = "doct_id_hospital")
	private Hospital hospital;
	
	


	
	//GET Y SET 

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

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	
	
	
	
	
	
	
}
