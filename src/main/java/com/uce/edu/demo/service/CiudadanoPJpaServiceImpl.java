package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoPJpaRepository;
import com.uce.edu.demo.repository.modelo.CiudadanoP;
@Service
public class CiudadanoPJpaServiceImpl implements ICiudadanoPJpaService {

	@Autowired
	private ICiudadanoPJpaRepository iCiudadanoPJpaRepository;
	
	@Override
	public void insertar(CiudadanoP ciudadanoP) {
		// TODO Auto-generated method stub
		this.iCiudadanoPJpaRepository.insertar(ciudadanoP);
	}

	@Override
	public void actualizar(CiudadanoP ciudadanoP) {
		// TODO Auto-generated method stub
		this.iCiudadanoPJpaRepository.actualizar(ciudadanoP);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iCiudadanoPJpaRepository.eliminar(id);
		
	}

	@Override
	public CiudadanoP buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoPJpaRepository.buscarPorId(id);
	}

}
