package com.uce.edu.demo;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.ICiudadanoJpaRepository;
import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.EstudianteContadorSemestre;
import com.uce.edu.demo.repository.modelo.EstudianteSencillo;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
import com.uce.edu.demo.service.ICiudadanoJpaService;
import com.uce.edu.demo.service.IEstudianteJpaService;
import com.uce.edu.demo.service.IPersonaJpaService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	private ICiudadanoJpaService ciudadanoService;	
	@Override
	public void run(String... args) throws Exception {
		

		
		Ciudadano ciudadano=new Ciudadano();
		ciudadano.setNombre("Xavier");
		ciudadano.setApellido("Paez");
		
		Empleado empleado=new Empleado();
		empleado.setCodigoIess("12345");
		empleado.setSalario(new BigDecimal(100));
		empleado.setCiudadano(ciudadano);
		
		ciudadano.setEmpleado(empleado);
		
		this.ciudadanoService.insertarCiudadano(ciudadano);
		
	
		Ciudadano ciudadano2=new Ciudadano();
		ciudadano2.setNombre("Mike");
		ciudadano2.setApellido("Garcia");
		
		Empleado empleado2=new Empleado();
		empleado2.setCodigoIess("442345");
		empleado2.setSalario(new BigDecimal(100));
		empleado2.setCiudadano(ciudadano2);
		
		ciudadano2.setEmpleado(empleado2);
		
	}

}
