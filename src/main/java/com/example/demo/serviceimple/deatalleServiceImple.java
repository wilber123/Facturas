package com.example.demo.serviceimple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.clienteRepository;
import com.example.demo.Repository.detalleRepository;
import com.example.demo.model.Cliente;
import com.example.demo.model.Detalle;
import com.example.demo.service.detalleService;


@Service
public class deatalleServiceImple implements detalleService {
	
	@Autowired
	private detalleRepository dr;

	@Override
	public List<Detalle> retrieveDetalle() {
		List<Detalle> detalle = dr.findAll();
		  return detalle;
	}

	
	public void setDetalleRepositor(detalleRepository detalle) {
		  this.dr = detalle;
		 }   
	
	
	
	@Override
	public Detalle getDetalle(Long detalleId) {
		 Optional< Detalle> optEmp = dr.findById(detalleId);
		  return optEmp.get();
	}

	@Override
	public void saveDetalle(Detalle detalle) {
		dr.save(detalle);
		
	}



}
