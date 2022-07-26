package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.manytomany.LibroAutor;

@Repository
@Transactional
public class LibroAutorImpl implements ILibroAutorRepository{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(LibroAutor libroAutor) {

		this.entityManager.persist(libroAutor);
	}

}
