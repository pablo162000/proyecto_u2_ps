package com.uce.edu.demo;

import java.util.List;

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

		List<Estudiante> e1 = iEstudianteJpaService.buscarDinamicamente("Pepe", "Moya", "6");

		for (Estudiante item : e1) {
			logJava.info(item);
		}

		List<Estudiante> e2 = iEstudianteJpaService.buscarDinamicamentePredicados("Moya", "6", 6);

		for (Estudiante item : e2) {
			logJava.info(item);
		}

		
	}

}