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
@Table(name = "autor2")
public class Autor2 {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aut2_id_seq")
	@SequenceGenerator(name = "aut2_id_seq", sequenceName = "aut2_id_seq", allocationSize = 1)
	@Column(name = "aut2_id")
	private Integer id;
	
	@Column(name = "aut2_nombre")
	private String nombre;
	
	
	@OneToMany(mappedBy = "autor2", cascade = CascadeType.ALL)
	private List<LibroAutor> libroAutores;
	
	
	

	@Override
	public String toString() {
		return "Autor2 [id=" + id + ", nombre=" + nombre + "]";
	}

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<LibroAutor> getLibroAutores() {
		return libroAutores;
	}

	public void setLibroAutores(List<LibroAutor> libroAutores) {
		this.libroAutores = libroAutores;
	}

	
	
	
	
	
	

}
