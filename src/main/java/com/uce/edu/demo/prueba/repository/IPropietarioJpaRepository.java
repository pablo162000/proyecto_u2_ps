package com.uce.edu.demo.prueba.repository;

import com.uce.edu.demo.prueba.repository.modelo.Propietario;

public interface IPropietarioJpaRepository {

	public Propietario consultar(String cedula);

	public void crear(Propietario p);

	public int eliminar(String cedula);

}
