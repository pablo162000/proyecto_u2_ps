package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Hospital;

@Repository
@Transactional
public class HospitalRepositoryImpl implements IHospitalRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hospital hospital) {
		this.entityManager.persist(hospital);
	}

	@Override
	public Hospital buscar(Integer id) {
		return this.entityManager.find(Hospital.class, id);
		
	}

	@Override
	public void actualizar(Hospital hospital) {
		this.entityManager.merge(hospital);
	}

	@Override
	public void eliminar(Integer id) {
		Hospital hospital =this.buscar(id); 
		
		this.entityManager.remove(hospital);
	}
	
}
