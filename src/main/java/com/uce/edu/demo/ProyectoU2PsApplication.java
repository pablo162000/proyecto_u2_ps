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
	IPropietarioJpaService iPropietarioJpaService;
	
	@Autowired
	IVehiculoJpaService iVehiculoJpaService;
	
	@Autowired
	IMatriculaGestorService iMatriculaGestorService;
	@Override
	public void run(String... args) throws Exception {
		
//		Propietario propietario = new Propietario();
//		propietario.setApellido("Raza");
//		propietario.setCedula("178558478");
//		propietario.setNombre("Paul");
//		propietario.setFechaNacimiento(LocalDateTime.now());
//		iPropietarioJpaService.crear(propietario);
//		iPropietarioJpaService.consultar("178558478");
//		iPropietarioJpaService.eliminar("178558478");
//		
//		
//		Vehiculo vehiculo = new Vehiculo();
//		vehiculo.setMarca("Nissan");
//		vehiculo.setPlaca("PUP887");
//		vehiculo.setPrecio(new BigDecimal(2000));
//		vehiculo.setTipo("L");
//		iVehiculoJpaService.insertar(vehiculo);
//		vehiculo.setPrecio(new BigDecimal(5055));
//		vehiculo.setTipo("P");
//		iVehiculoJpaService.actualizar(vehiculo);
//		iVehiculoJpaService.buscar("PUP887");
//		
//		iVehiculoJpaService.eliminar("PUP887");
//		
		
		iMatriculaGestorService.generar("178558478", "PUP887");
	}

}