package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;

import org.apache.log4j.Logger;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	IPersonaJdbcService iPersonaJdbcService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Persona persona= new Persona();
		persona.setId(4);
		persona.setNombre("Pepito");
		persona.setApellido("PerezZ");
        //Insertar
		//this.iPersonaJdbcService.guardar(persona);
		
		//Actualizar
		Persona persona1= new Persona();
		persona1.setId(1);
		persona1.setNombre("A");
		persona1.setApellido("B");

		//this.iPersonaJdbcService.actualizar(persona1);
		//Eliminar
		//this.iPersonaJdbcService.eliminar(2);
		//Buscar
		this.iPersonaJdbcService.buscarPorId(1);

		this.logJava.info(this.iPersonaJdbcService.buscarPorId(1));
	}

}
