package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Estudiante;
@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository{

	private Logger logJava = Logger.getLogger(EstudianteJpaRepositoryImpl.class);
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.logJava.info("Se busca al estudiante de Id: "+ id);
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.logJava.info("Se inserta al estudiante: "+ estudiante);

		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.logJava.info("Se actualiza al estudiante: "+ estudiante);

		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.logJava.info("Se elimina al estudiante de Id: "+ id);

		Estudiante estudiante = this.buscarPorId(id);
		this.entityManager.remove(estudiante);
		
	}

}
