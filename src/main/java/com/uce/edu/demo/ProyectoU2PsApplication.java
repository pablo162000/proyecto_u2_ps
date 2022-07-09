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
	IPersonaJpaService iPersonaJpaService;

	@Override
	public void run(String... args) throws Exception {

//		//Actualizar con JPQL
//		
		int resultado = this.iPersonaJpaService.actualizarPorApellido("FE", "Perez");
		logJava.info("Cantidad de registros actulizados " + resultado);
//	
		int resultado2 = this.iPersonaJpaService.eliminarPorGenero("M");
		logJava.info("Cantidad de registros actulizados " + resultado2);

	}

}