package com.uce.edu.demo.repository.modelo;

import java.io.Serializable;

public class EstudianteContadorSemestre implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String genero;
	private Long numero;
	
	
	
	public EstudianteContadorSemestre() {
		// TODO Auto-generated constructor stub
	}
	

	public EstudianteContadorSemestre(String genero, Long numero) {
		// TODO Auto-generated constructor stub\
		this.genero= genero;
		this.numero = numero;
	}
	
	
	
	@Override
	public String toString() {
		return "EstudianteContadorSemestre [genero=" + genero + ", numero=" + numero + "]";
	}
	
	//GET Y SET
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	


}
