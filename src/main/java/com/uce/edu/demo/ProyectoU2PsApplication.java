package com.uce.edu.demo;

import java.util.List;

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
		
		
		Persona per1  = new Persona();
		per1.setApellido("Velez");
		per1.setNombre("Daniel");
		per1.setGenero("M");
		per1.setCedula("114154");
		this.iPersonaJpaService.guardar(per1);
		
		Persona perTyped = this.iPersonaJpaService.buscarPorCedulaTyped("11818181");

		logJava.info("Persona Typed: "+ perTyped);
		
		Persona perNamed = this.iPersonaJpaService.buscarPorCedulaNamed("11818181");
		logJava.info("Persona Named: "+ perNamed);

		
		Persona perTypedNamed = this.iPersonaJpaService.buscarPorCedulaTypedNamed("11818181");
		logJava.info("Persona TypedNamed: "+ perTypedNamed);


		List<Persona> listaPersona = this.iPersonaJpaService.buscarPorNombreApellido("Daniel", "Velez");
	
		for(Persona item : listaPersona) {
			logJava.info("Persona: "+ item);

		}
		
	
	}

}