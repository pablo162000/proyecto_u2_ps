package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;

@Service
public class EstudianteJpaServiceImpl implements IEstudianteJpaService {

	@Autowired
	private IEstudianteJpaRepository iEstudianteJpaRepository;

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorId(id);
	}

	@Override
	public List<Estudiante> buscarPorGeneroTyped(String genero) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorGeneroTyped(genero);
	}

	@Override
	public List<Estudiante> buscarPorGeneroNamed(String genero) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorGeneroNamed(genero);
	}

	@Override
	public List<Estudiante> buscarPorGeneroTypedNamed(String genero) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorGeneroTypedNamed(genero);
	}

	@Override
	public List<Estudiante> buscarPorNombreTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreTyped(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreNamed(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorNombreTypedNamed(nombre);
	}

	@Override
	public List<Estudiante> buscarPorApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorApellidoNative(apellido);
	}

	@Override
	public List<Estudiante> buscarPorSemestreNamedNative(String semestre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorSemestreNamedNative(semestre);
	}

	@Override
	public Estudiante buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarPorCedulaNative(cedula);
	}

	@Override
	public Estudiante buscarNombreApellidoNamedNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarNombreApellidoNamedNative(nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarDinamicamente(String nombre, String apellido, String semestre) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarDinamicamente(nombre, apellido, semestre);
	}

	@Override
	public List<Estudiante> buscarDinamicamentePredicados(String apellido, String semestre, Integer id) {
		// TODO Auto-generated method stub
		return this.iEstudianteJpaRepository.buscarDinamicamentePredicados(apellido, semestre, id);
	}

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.actualizar(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iEstudianteJpaRepository.eliminar(id);
	}

}
