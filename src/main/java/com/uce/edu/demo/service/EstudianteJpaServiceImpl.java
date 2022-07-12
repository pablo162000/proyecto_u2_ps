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
