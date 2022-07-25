package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Doctor;
@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Doctor doctor) {
 		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor buscar(Integer id) {
 		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizar(Doctor doctor) {
 		this.entityManager.merge(doctor);
	}

	@Override
	public void eliminar(Integer id) {
 		Doctor doctorBuscado = this.buscar(id);
		this.entityManager.remove(doctorBuscado);
	}

}
