package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteJpaService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	
	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//BUSCAR
		logJava.info("Dato con JPA: "+ this.iEstudianteJpaService.buscarPorId(1));
	
		
		//GUARDAR
		Estudiante estudiante =new Estudiante();
		estudiante.setApellido("Joestar");
		estudiante.setNombre("Jonathan");
		estudiante.setCedula("8481818118");
		estudiante.setGenero("M");
		estudiante.setId(5);
		this.iEstudianteJpaService.guardar(estudiante);
		
		//ACTUALIZAR
		Estudiante estudiante1 =new Estudiante();
		estudiante1.setApellido("Axel");
		estudiante1.setNombre("Rose");
		estudiante1.setCedula("181788849");
		estudiante1.setGenero("M");
		estudiante1.setId(3);
		this.iEstudianteJpaService.actualizar(estudiante1);
		
	
		//ELIMINAR
		this.iEstudianteJpaService.eliminar(4);
	
	}

}