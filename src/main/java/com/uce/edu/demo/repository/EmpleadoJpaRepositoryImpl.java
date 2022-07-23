package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetoone.Empleado;
@Repository
@Transactional
public class EmpleadoJpaRepositoryImpl implements IEmpleadoJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}

}
