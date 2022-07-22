package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CiudadanoP;

@Repository
@Transactional
public class CiudadanoPJpaRepositoryImpl implements ICiudadanoPJpaRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CiudadanoP ciudadanoP) {
		// TODO Auto-generated method stub
		 this.entityManager.persist(ciudadanoP);
	}

	@Override
	public void actualizar(CiudadanoP ciudadanoP) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadanoP);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CiudadanoP ciudadanoP = this.buscarPorId(id);
		this.entityManager.remove(ciudadanoP);
	}

	@Override
	public CiudadanoP buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CiudadanoP.class, id);
	}

}
