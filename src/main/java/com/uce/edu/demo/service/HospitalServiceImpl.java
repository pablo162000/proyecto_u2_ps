package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IHospitalRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Hospital;
@Service
public class HospitalServiceImpl implements IHospitalService{

	@Autowired
	private IHospitalRepository  iHospitalRepository; 
	
	@Override
	public void insertar(Hospital hospital) {
		this.iHospitalRepository.insertar(hospital);
	}

	@Override
	public Hospital buscar(Integer id) {
		return this.iHospitalRepository.buscar(id);
	}

	@Override
	public void actualizar(Hospital hospital) {
		this.iHospitalRepository.actualizar(hospital);
	}

	@Override
	public void eliminar(Integer id) {

		this.iHospitalRepository.eliminar(id);
	}

}
