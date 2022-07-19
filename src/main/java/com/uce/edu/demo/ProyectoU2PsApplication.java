package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	
	@Autowired
	private IPersonaJpaService iPersonaJpaService;
	@Autowired
	private IEstudianteJpaService iEstudianteJpaService;

	@Override
	public void run(String... args) throws Exception {
		
		
		Persona per1 = new Persona();
		per1.setApellido("Chavez");
		per1.setNombre("Dayana");
		per1.setCedula("45685");
		per1.setGenero("F");
		
		//iPersonaJpaService.guardar(per1);
		//iPersonaJpaService.eliminar(12);

		List<PersonaSencilla> listaPersona =  this.iPersonaJpaService.buscarPorApellidoSencillo("Velez");
		
		for(PersonaSencilla perItem : listaPersona) {
			logJava.info("Persona Sencilla: "+ perItem);
		}
		
		
		List<PersonaContadorGenero> miListaPersonaGenero = iPersonaJpaService.consultarCantidadPorGenero();
	
		for(PersonaContadorGenero perItem : miListaPersonaGenero) {
			logJava.info("Genero: "+ perItem);
		}
	
	}

}