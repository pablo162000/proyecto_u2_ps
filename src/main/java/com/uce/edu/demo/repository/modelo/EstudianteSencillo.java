package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteSencillo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String apellido;
	private String cedula;
	
	public EstudianteSencillo() {
		// TODO Auto-generated constructor stub
	}
	
	public EstudianteSencillo(String apellido, String cedula) {
		
		// TODO Auto-generated constructor stub
		this.apellido = apellido;
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "EstudianteSencillo [apellido=" + apellido + ", cedula=" + cedula + "]";
	}

	
	//GET Y SET
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
	
	
	


}
