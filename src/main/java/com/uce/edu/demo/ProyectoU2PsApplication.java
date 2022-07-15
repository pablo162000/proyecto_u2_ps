package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.IEstudianteJpaRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
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
		
		
		Estudiante est = new  Estudiante();
		
		est.setNombre("Rodrigo");
		est.setApellido("Moya");
		est.setCedula("7898151");
		est.setSemestre("3");
		est.setGenero("M");

		
		//iEstudianteJpaService.guardar(est);
		//iEstudianteJpaService.buscarPorSemestreNamedNative("6");
		//iEstudianteJpaService.buscarPorApellidoNative("Moya");
		
		
		logJava.info(iEstudianteJpaService.buscarPorSemestreNamedNative("6"));

	    logJava.info(iEstudianteJpaService.buscarPorApellidoNative("Moya"));
	    
	    logJava.info(iEstudianteJpaService.buscarPorCedulaNative("7898151"));
	    
	    logJava.info(iEstudianteJpaService.buscarNombreApellidoNamedNative("Pablo", "Suntaxi"));


		//iEstudianteJpaService.actualizar(est);
		//iEstudianteJpaService.bus
		
		//iPersonaJpaService.guardar(per);
		
		
		//logJava.info(iPersonaJpaService.buscarPorCedulaNative("55"));
		//logJava.info(iPersonaJpaService.buscarPorCedulaNamedNative("55"));
		
	
	
		
	
	}

}