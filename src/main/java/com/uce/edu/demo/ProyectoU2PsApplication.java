package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.manytomany.Autor2;
import com.uce.edu.demo.repository.modelo.manytomany.Libro2;
import com.uce.edu.demo.repository.modelo.manytomany.LibroAutor;
import com.uce.edu.demo.service.IAutor2Service;
import com.uce.edu.demo.service.ILibro2Service;
import com.uce.edu.demo.service.ILibroAutorService;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	

	@Autowired
	private IAutor2Service iAutor2Service;

	@Autowired
	private ILibro2Service iLibro2Service;

	@Override
	public void run(String... args) throws Exception {

		Libro2 libro1 = new Libro2();
		libro1.setCantidadPaginas(800);
		libro1.setTitulo("Prueba 1");
		
		Autor2 autor1 = new Autor2();
		autor1.setNombre("Homero");

		Autor2 autor2 = new Autor2();
		autor2.setNombre("Anonimo");

		
		
		LibroAutor lautor1 = new LibroAutor();
		lautor1.setAutor2(autor1);
		lautor1.setLibro2(libro1);

		LibroAutor lautor2 = new LibroAutor();
		lautor2.setLibro2(libro1);
		lautor2.setAutor2(autor2);

		List<LibroAutor> lista = new ArrayList<>();
		lista.add(lautor1);
		lista.add(lautor2);

		libro1.setLibroAutores(lista);
		
		iLibro2Service.insertar(libro1);
		
		/////////////////////////////////////////////////////
		
		Autor2 autor3 = new Autor2();
		autor3.setNombre("Carlos");
		
		
		
		Libro2 libro3 = new Libro2();
		libro3.setTitulo("Prueba3");
		libro3.setCantidadPaginas(100);
		
		
		LibroAutor libroa1 = new LibroAutor();
		libroa1.setLibro2(libro3);
		libroa1.setAutor2(autor3);
		
		
		Libro2 libro2 = new Libro2();
		libro2.setCantidadPaginas(600);
		libro2.setTitulo("Prueba2");
		
		LibroAutor libroa2 = new LibroAutor();
		libroa2.setLibro2(libro2);
		libroa2.setAutor2(autor3);

		
		List<LibroAutor> listaLibros = new ArrayList<>();
		listaLibros.add(libroa2);
		listaLibros.add(libroa1);

		autor3.setLibroAutores(listaLibros);
		
		iAutor2Service.insertar(autor3);
		
		
		

		

	}

}
