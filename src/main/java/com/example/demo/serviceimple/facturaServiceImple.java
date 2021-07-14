package com.example.demo.serviceimple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.detalleRepository;
import com.example.demo.Repository.facturaRepository;
import com.example.demo.model.Detalle;
import com.example.demo.model.Factura;
import com.example.demo.model.Producto;
import com.example.demo.service.facturaService;


@Service
public class facturaServiceImple implements facturaService {
	
	
	@Autowired
	private facturaRepository ft;
	
	public void setFacturaRepositor(facturaRepository factura) {
		  this.ft = factura;
		 }   

	@Override
	public List<Factura> retrieveFactura() {
		List<Factura> detalle = ft.findAll();
		  return detalle;
	}

	@Override
	public Factura getFactura(Long facturaId) {
		 Optional<Factura> optEmp = ft.findById(facturaId);
		  return optEmp.get();
	}

	@Override
	public void saveFactura(Factura factura) {
		ft.save(factura);
		
	}

	

}
