package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.prueba.repository.IVehiculoJpaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;
import com.uce.edu.demo.prueba.service.IMatriculaGestorService;
import com.uce.edu.demo.prueba.service.IMatriculaService;
import com.uce.edu.demo.prueba.service.IPropietarioJpaService;
import com.uce.edu.demo.prueba.service.IVehiculoJpaService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	private IPropietarioJpaService iPropietarioJpaService;
	
	@Autowired
	private IVehiculoJpaService iVehiculoJpaService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;

	@Override
	public void run(String... args) throws Exception {

		Propietario propietario1 = new Propietario();
		propietario1.setApellido("Suntaxi");
		propietario1.setCedula("1724157678");
		propietario1.setNombre("Pablo");
		propietario1.setFechaNacimiento(LocalDateTime.now());
		

		iPropietarioJpaService.crear(propietario1);
		
		
		

		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setMarca("Toyota");
		vehiculo2.setPlaca("4848P89");
		vehiculo2.setPrecio(new BigDecimal(8000));
		vehiculo2.setTipo("P");
		
		iVehiculoJpaService.insertar(vehiculo2);
		
		
		iMatriculaGestorService.generar(propietario1.getCedula(), vehiculo2.getPlaca());

	}

}
