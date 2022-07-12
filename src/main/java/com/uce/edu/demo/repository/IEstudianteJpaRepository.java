package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteJpaRepository {

	public Estudiante buscarPorId(Integer id);
	
	public List<Estudiante> buscarPorGeneroTyped(String genero);
	public List<Estudiante> buscarPorGeneroNamed(String genero);
	public List<Estudiante> buscarPorGeneroTypedNamed(String genero);
	
	public List<Estudiante> buscarPorNombreTyped(String nombre);
	public List<Estudiante> buscarPorNombreNamed(String nombre);
	public List<Estudiante> buscarPorNombreTypedNamed(String nombre);



	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public void eliminar(Integer id);

}
