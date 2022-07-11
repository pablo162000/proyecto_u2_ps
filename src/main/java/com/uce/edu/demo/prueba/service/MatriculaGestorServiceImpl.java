package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.IMatriculaJpaRepository;
import com.uce.edu.demo.prueba.repository.IPropietarioJpaRepository;
import com.uce.edu.demo.prueba.repository.IVehiculoJpaRepository;
import com.uce.edu.demo.prueba.repository.modelo.Matricula;
import com.uce.edu.demo.prueba.repository.modelo.Propietario;
import com.uce.edu.demo.prueba.repository.modelo.Vehiculo;
@Service
public class MatriculaGestorServiceImpl implements IMatriculaGestorService {
	@Autowired
	private IPropietarioJpaRepository iPropietarioJpaRepository;

	@Autowired
	private IVehiculoJpaRepository iVehiculoJpaRepository;
	
	@Autowired
	@Qualifier("pesado")
	IMatriculaService matriculaServicePesado;

	@Autowired
	@Qualifier("liviano")
	IMatriculaService matriculaServiceLiviano;

	@Autowired
	private IMatriculaJpaRepository iMatriculaRepository;
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario pro = this.iPropietarioJpaRepository.consultar(cedula);
		Vehiculo vehi = this.iVehiculoJpaRepository.buscar(placa);
		BigDecimal valorMatricula;
		String tipo = vehi.getTipo();

		if (tipo.equals("P")) {
			valorMatricula = this.matriculaServicePesado.calcular(vehi.getPrecio());
		} else {
			valorMatricula = this.matriculaServiceLiviano.calcular(vehi.getPrecio());

		}
		
		if(valorMatricula.compareTo(new BigDecimal(2000))>0) {
			BigDecimal valorDescuento = valorMatricula.multiply(new BigDecimal(7)).divide(new BigDecimal(100));
		    valorMatricula=valorMatricula.subtract(valorDescuento);
		}
		
		Matricula matricula= new Matricula();
		matricula.setFechaMatricula(null);
		matricula.setPropietario(pro);
		matricula.setVehiculo(vehi);
		matricula.setValorMatricula(valorMatricula);
		matricula.setFechaMatricula(LocalDateTime.now());
		
		this.iMatriculaRepository.crear(matricula);
		
	}

}
