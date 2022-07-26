package com.uce.edu.demo.repository.modelo.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro2")
public class Libro2 {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lib2_id_seq")
	@SequenceGenerator(name = "lib2_id_seq", sequenceName = "lib2_id_seq", allocationSize = 1)
	@Column(name = "lib2_id")
	private Integer id;

	@Column(name = "lib2_titulo")
	private String titulo;

	@Column(name = "lib2_cantidad_paginas")
	private Integer cantidadPaginas;

	@OneToMany(mappedBy = "libro2", cascade = CascadeType.ALL)
	private List<LibroAutor> libroAutores;

	@Override
	public String toString() {
		return "Libro2 [id=" + id + ", titulo=" + titulo + ", cantidadPaginas=" + cantidadPaginas + "]";
	}

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public List<LibroAutor> getLibroAutores() {
		return libroAutores;
	}

	public void setLibroAutores(List<LibroAutor> libroAutores) {
		this.libroAutores = libroAutores;
	}
	
	

}
