package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;

import aj.org.objectweb.asm.Type;

@Repository
@Transactional
public class EstudianteJpaRepositoryImpl implements IEstudianteJpaRepository {

	private Logger logJava = Logger.getLogger(EstudianteJpaRepositoryImpl.class);
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.logJava.info("Se busca al estudiante de Id: " + id);
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public List<Estudiante> buscarPorGeneroTyped(String genero) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(
				"SELECT e FROM Estudiante e WHERE e.genero = :datoGenero ORDER BY e.apellido", Estudiante.class);
		myTypedQuery.setParameter("datoGenero", genero);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorGeneroNamed(String genero) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorGenero");

		myQuery.setParameter("datoGenero", genero);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorGeneroTypedNamed(String genero) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorGenero",
				Estudiante.class);
		myQuery.setParameter("datoGenero", genero);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> mytypedQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre ORDER BY e.id", Estudiante.class);
		mytypedQuery.setParameter("datoNombre", nombre);

		return mytypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.logJava.info("Se inserta al estudiante: " + estudiante);

		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.logJava.info("Se actualiza al estudiante: " + estudiante);

		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.logJava.info("Se elimina al estudiante de Id: " + id);

		Estudiante estudiante = this.buscarPorId(id);
		this.entityManager.remove(estudiante);

	}

}
