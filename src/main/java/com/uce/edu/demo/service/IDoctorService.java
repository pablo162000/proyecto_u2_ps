package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetomany.Doctor;

public interface IDoctorService {

	// CRUD
	public void insertar(Doctor doctor);

	public Doctor buscar(Integer id);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);

}
