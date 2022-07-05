package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	
	@Autowired
	IPersonaJpaService iPersonaJpaService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//BUSCAR
		//logJava.info("Dato con JPA: "+ this.iPersonaJpaService.buscarPorId(4));
	
		Persona per = new  Persona();
		//per.setId(8);
		per.setNombre("Pepito123");
		per.setApellido("Perez");
		//GUARDAR
		this.iPersonaJpaService.guardar(per);
		
		//ACTUALIZAR
		Persona per1 = new  Persona();
		per1.setId(4);
		per1.setNombre("Andrea ");
		per1.setApellido("Solis");
		//this.iPersonaJpaService.actualizar(per1);
		
	
		//ELIMINAR
		//this.iPersonaJpaService.eliminar(1);
	
	}

}