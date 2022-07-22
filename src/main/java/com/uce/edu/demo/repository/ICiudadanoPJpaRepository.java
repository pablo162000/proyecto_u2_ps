package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.CiudadanoP;

public interface ICiudadanoPJpaRepository {
	
	
	
	public void insertar(CiudadanoP ciudadanoP);
	
	public void actualizar(CiudadanoP ciudadanoP);

	public void eliminar(Integer id);
	
	public CiudadanoP buscarPorId(Integer id);

}
