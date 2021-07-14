package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Factura;


public interface facturaService {
	public List<Factura> retrieveFactura();
	
	 public Factura getFactura(Long  facturaId);
	  
	 public void saveFactura(Factura factura);
	  
	

}
