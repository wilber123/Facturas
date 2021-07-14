package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Detalle;
import com.example.demo.model.Factura;
import com.example.demo.model.Producto;

public interface detalleService {
	public List<Detalle> retrieveDetalle();
	
	 public Detalle getDetalle(Long  detalleId);
	  
	 public void saveDetalle(Detalle detalle);
	  
	
}
