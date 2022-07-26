package com.uce.edu.demo;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.service.ILibroService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Autowired
	private ILibroService iLibroService;

	@Override
	public void run(String... args) throws Exception {

		Libro libro = new Libro();

		libro.setCantidadPaginas(500);
		libro.setTitulo("Libro titulo");


		Autor autor = new Autor();
		autor.setNombre("Juan Perez");
		Autor autor1 = new Autor();
		autor1.setNombre("Juan Perez 2");
		Autor autor2 = new Autor();
		autor.setNombre("Juan Perez 3");
		
		
		//Set<Libro> libros= new HashSet<>();
		
		Set<Autor> autores= new HashSet<>();
		autores.add(autor);
		autores.add(autor1);
		autores.add(autor2);
		
		libro.setAutores(autores);
		
	    iLibroService.insertar(libro);

		

	}

}
