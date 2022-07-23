package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICiudadanoJpaRepository;
import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;
@Service
public class CiudadanoJpaServiceImpl implements ICiudadanoJpaService{
	@Autowired
	ICiudadanoJpaRepository iCiudadanoJpaRepository;

	@Override
	public void insertarCiudadano(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoJpaRepository.insertarCiudadano(ciudadano);
	}

}
