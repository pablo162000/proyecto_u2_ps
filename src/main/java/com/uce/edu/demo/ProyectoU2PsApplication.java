package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cajero.repository.modelo.DetalleFactura;
import com.uce.edu.demo.cajero.repository.modelo.Factura;
import com.uce.edu.demo.cajero.service.IFacturaService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	private IFacturaService iFacturaService;

	@Override
	public void run(String... args) throws Exception {

		 Factura fact=  this.iFacturaService.consultar(1);
		 
		 logJava.info("numero: "+ fact.getNumero());
		 logJava.info("fecha: "+ fact.getFecha() );
		 
		 logJava.info("Cliente: "+ fact.getCliente().getNumeroTarjeta());
		 
		 List<DetalleFactura> detalles = fact .getDetalles();
		 for(DetalleFactura deta : detalles) {
			 logJava.info(deta);
		 }
	}

}
