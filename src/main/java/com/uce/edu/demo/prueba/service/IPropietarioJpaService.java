package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioJpaService {
	


	public Propietario consultar(String cedula);

	public void crear(Propietario p);

	public int eliminar(String cedula);

}
