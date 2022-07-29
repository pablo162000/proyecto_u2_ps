package com.uce.edu.demo.prueba.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matr_id_seq")
	@SequenceGenerator(name = "matr_id_seq",sequenceName = "matr_id_seq", allocationSize = 1)
	@Column(name = "matr_id")
	private Integer id;
	
	@Column(name = "matr_fecha_matricula")
	private LocalDateTime fechaMatricula;
	
	@Column(name = "matr_valor_matricula")
	private BigDecimal valorMatricula;
	
	@ManyToOne
	@JoinColumn(name = "matr_id_propietario")
	private Propietario  propietario;
	
	@OneToOne
	@JoinColumn(name = "matr_id_vehiculo")
	private Vehiculo vehiculo;
	
	

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", valorMatricula=" + valorMatricula + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	
	
	
	
	

}
