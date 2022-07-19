package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteContadorSemestre;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;

public interface IEstudianteJpaService {

	public Estudiante buscarPorId(Integer id);

	public List<Estudiante> buscarPorGeneroTyped(String genero);

	public List<Estudiante> buscarPorGeneroNamed(String genero);

	public List<Estudiante> buscarPorGeneroTypedNamed(String genero);

	public List<Estudiante> buscarPorNombreTyped(String nombre);

	public List<Estudiante> buscarPorNombreNamed(String nombre);

	public List<Estudiante> buscarPorNombreTypedNamed(String nombre);

	public List<Estudiante> buscarPorApellidoNative(String apellido);

	public List<Estudiante> buscarPorSemestreNamedNative(String semestre);

	public Estudiante buscarPorCedulaNative(String cedula);

	public Estudiante buscarNombreApellidoNamedNative(String nombre, String apellido);

	public List<Estudiante> buscarDinamicamente(String nombre, String apellido, String semestre);

	public List<Estudiante> buscarDinamicamentePredicados(String apellido, String semestre, Integer id);

	public EstudianteSencillo buscarPorCedulaSencillo(String cedula);

	public List<EstudianteContadorSemestre> consultarCantidadPorSemestre();

	public void guardar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public void eliminar(Integer id);
}
