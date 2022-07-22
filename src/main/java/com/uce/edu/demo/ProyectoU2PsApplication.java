package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.CiudadanoP;
import com.uce.edu.demo.repository.modelo.Pasaporte;
import com.uce.edu.demo.service.ICiudadanoPJpaService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	private ICiudadanoPJpaService iCiudadanoPJpaService;

	@Override
	public void run(String... args) throws Exception {

		CiudadanoP ciudadanoP = new CiudadanoP();

		ciudadanoP.setApellido("Suntaxi");
		ciudadanoP.setCedula("1724157688");
		ciudadanoP.setFechaNacimiento(LocalDateTime.now());
		ciudadanoP.setNombre("Pablo");
		Pasaporte  passport= new Pasaporte();
		passport.setCiudadanop(ciudadanoP);
		passport.setFechaCaducidad(LocalDateTime.now());
		passport.setFechaEmision(LocalDateTime.now());
		passport.setNumero("11848");
		ciudadanoP.setPasaporte(passport);


		CiudadanoP ciudadano1 = new CiudadanoP();

		ciudadano1.setApellido("Suntaxi");
		ciudadano1.setCedula("1724157699");
		ciudadano1.setFechaNacimiento(LocalDateTime.now());
		ciudadano1.setNombre("Karen");
		
		logJava.info("Se ha insertado");
		iCiudadanoPJpaService.insertar(ciudadanoP);

		ciudadanoP.setNombre("Pedro");
		ciudadanoP.setCedula("1724157894");
		logJava.info("Se ha actualizado");
		iCiudadanoPJpaService.actualizar(ciudadanoP);
		logJava.info("Se ha buscado"+iCiudadanoPJpaService.buscarPorId(16));
		logJava.info("Se ha eliminado");
		iCiudadanoPJpaService.eliminar(16);
		
		
		
		

	}

}
