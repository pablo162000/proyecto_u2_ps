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
	public List<Estudiante> buscarPorApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE estu_apellido = :datoApellido ORDER BY estu_id", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}
	
	

	@Override
	public List<Estudiante> buscarPorSemestreNamedNative(String semestre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorSemestre", Estudiante.class);
		myQuery.setParameter("datoSemestre", semestre);

		return myQuery.getResultList();
	}
	
	
	@Override
	public Estudiante buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE estu_cedula = :datoCedula ", Estudiante.class);
		myQuery.setParameter("datoCedula", cedula);

		return (Estudiante)myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarNombreApellidoNamedNative(String nombre, String apellido) {
		TypedQuery<Estudiante> myQuery=this.entityManager.createNamedQuery("Estudiante.buscarNombreApellido", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);

		
		return myQuery.getSingleResult();
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
