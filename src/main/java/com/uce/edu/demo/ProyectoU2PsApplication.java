package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.IHospitalRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hospital;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHospitalService;
import com.uce.edu.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	private IHospitalService iHospitalService;

	@Override
	public void run(String... args) throws Exception {

		Hospital hospital = new Hospital();
		hospital.setDireccion("La Gasca");
		hospital.setNombre("Andrade Marin");
		
		//this.iHospitalService.insertar(hospital);
		
		Hospital hospital1 = new Hospital();
		hospital1.setDireccion("La Colon");
		hospital1.setNombre("Baca Ortiz");
		this.iHospitalService.insertar(hospital1);
		
		hospital1.setDireccion("La Marin");
		hospital1.setNombre("IESS");
		this.iHospitalService.actualizar(hospital1);
		
		Hospital hospitalbuscado = this.iHospitalService.buscar(1);
		logJava.info(hospitalbuscado);
		
		
		this.iHospitalService.eliminar(3);
		

	}

}
