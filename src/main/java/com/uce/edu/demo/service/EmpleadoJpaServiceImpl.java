package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEmpleadoJpaRepository;
import com.uce.edu.demo.repository.modelo.Empleado;
@Service
public class EmpleadoJpaServiceImpl implements IEmpleadoJpaService{

	@Autowired
	private IEmpleadoJpaRepository iEmpleadoJpaRepository;
	@Override
	public void insertarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		this.iEmpleadoJpaRepository.insertarEmpleado(empleado);
		
	}
	

}
