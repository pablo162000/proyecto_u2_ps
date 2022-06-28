package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IEstudianteJdbcService;
import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Estudiante;
import org.apache.log4j.Logger;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	IPersonaJdbcService iPersonaJdbcService;
	@Autowired
	IEstudianteJdbcService iEstudianteJdbcService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Estudiante estudiante = new Estudiante();
		estudiante.setId(3);
		estudiante.setNombre("Axel");
		estudiante.setApellido("Suntaxi");
		estudiante.setGenero("M");
		estudiante.setCedula("1754849847");
		// Insertar
		this.iEstudianteJdbcService.guardar(estudiante);

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setId(4);
		estudiante3.setNombre("Arthur");
		estudiante3.setApellido("Perez");
		estudiante3.setGenero("M");
		estudiante3.setCedula("174848858");
		// Actualizar
		this.iEstudianteJdbcService.actualizar(estudiante3);

		// Eliminar
		this.iEstudianteJdbcService.eliminar(2);

		// Buscar
		this.iEstudianteJdbcService.buscarPorId(4);
		this.logJava.info(this.iEstudianteJdbcService.buscarPorId(4));

	}

}
