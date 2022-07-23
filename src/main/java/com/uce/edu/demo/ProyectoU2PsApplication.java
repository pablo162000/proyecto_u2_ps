package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	private IHotelService iHotelService;

	@Autowired
	private IHabitacionService iHabitacionService;

	@Override
	public void run(String... args) throws Exception {

		
	Hotel hotel2 = new Hotel();
	hotel2.setNombre("Hilton Colon GUY");
	hotel2.setDireccion("Malecon");
	//this.iHotelService.insertar(hotel2);
		
		Hotel hote =new Hotel();
		hote.setId(1);

		Habitacion habi1 = new Habitacion();
		habi1.setNumero("A234");
		habi1.setPiso("10");
		habi1.setTipo("Familiar");
		habi1.setHotel(hote);
		
		Habitacion habi2 = new Habitacion();
		habi2.setNumero("1718");
		habi2.setPiso("1");
		habi2.setTipo("Matrimonial");
		habi2.setHotel(hote);

		//this.iHabitacionService.insertar(habi1);
		this.iHabitacionService.insertar(habi2);


	}

}
