package com.uce.edu.demo.cajero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.cajero.repository.IFacturaRepository;
import com.uce.edu.demo.cajero.repository.modelo.Factura;
@Service
public class FacturaServiceImpl implements IFacturaService {

	
	@Autowired
	private IFacturaRepository iFacturaRepository;
	@Override
	public Factura consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.iFacturaRepository.consultar(id);
	}

}
