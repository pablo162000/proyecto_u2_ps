package com.uce.edu.demo.prueba.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.uce.edu.demo.prueba.repository.modelo.Matricula;

public class MatriculaJpaRepositoryImpl implements IMatriculaJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);

	}

}
