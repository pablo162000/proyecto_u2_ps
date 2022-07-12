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
		
		Estudiante estu = new Estudiante();
		estu.setApellido("Martinez");
		estu.setCedula("1724178961");
		estu.setGenero("M");
		estu.setNombre("Kevin");
		//iEstudianteJpaService.guardar(estu);
		
		List<Estudiante> listaEstudiante= this.iEstudianteJpaService.buscarPorGeneroTyped("M");
		//iEstudianteJpaService.buscarPorGeneroTyped("M");
		
		for(Estudiante item : listaEstudiante) {
			logJava.info("Estudiante Typed: "+item);
		}
		
		List<Estudiante> listaEstudiante1= this.iEstudianteJpaService.buscarPorGeneroNamed("F");

		for(Estudiante item : listaEstudiante1) {
			logJava.info("Estudiante Named: "+item);
		}
	
		
		List<Estudiante> listaEstudiante2= this.iEstudianteJpaService.buscarPorGeneroTypedNamed("M");

		for(Estudiante item : listaEstudiante2) {
			logJava.info("Estudiante TypedNamed: "+item);
		}
		
		
		List<Estudiante> listaEstudiante3= this.iEstudianteJpaService.buscarPorNombreTyped("Kevin");

		for(Estudiante item : listaEstudiante3) {
			logJava.info("Estudiante Typed: "+item);
		}
		
		List<Estudiante> listaEstudiante4= this.iEstudianteJpaService.buscarPorNombreNamed("Kevin");

		for(Estudiante item : listaEstudiante4) {
			logJava.info("Estudiante Named: "+item);
		}
		
		List<Estudiante> listaEstudiante5= this.iEstudianteJpaService.buscarPorNombreTypedNamed("Kevin");

		for(Estudiante item : listaEstudiante5) {
			logJava.info("Estudiante TypedNamed: "+item);
		}
		
	
	}

}