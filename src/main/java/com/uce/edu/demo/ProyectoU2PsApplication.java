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
	private IPersonaJpaService iPersonaJpaService;

	@Override
	public void run(String... args) throws Exception {
		
		
		Persona per = new  Persona();
		per.setApellido("Suntaxi");
		per.setCedula("55");
		
		//iPersonaJpaService.guardar(per);
		
		
		logJava.info(iPersonaJpaService.buscarPorCedulaNative("55"));
		logJava.info(iPersonaJpaService.buscarPorCedulaNamedNative("55"));
		
	
	
		
	
	}

}