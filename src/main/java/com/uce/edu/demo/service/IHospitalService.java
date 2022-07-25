package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetomany.Hospital;

public interface IHospitalService {
	
	//CRUD
		public void insertar(Hospital hospital);
		
		public Hospital buscar(Integer id);

		public void actualizar(Hospital hospital);

		public void  eliminar(Integer id);

}
