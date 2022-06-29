package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.to.PersonaTo;

public interface IPersonaJdbcRepository {
	
	public List<PersonaTo> buscarTodos();
	public PersonaTo buscarPorId(int id);
	public void insertar(PersonaTo personaTo);
	public void actualizar(PersonaTo personaTo);
	public void eliminar(int id);
	 

}
