package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.IPropietarioJpaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
@Service
public class PropietarioServiceImpl implements IPropietarioJpaService{

	
	@Autowired
	private IPropietarioJpaRepository iPropietarioJpaRepository;
	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioJpaRepository.consultar(cedula);
	}

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioJpaRepository.crear(p);
	}

	@Override
	public int eliminar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioJpaRepository.eliminar(cedula);
	}

	


	

}
