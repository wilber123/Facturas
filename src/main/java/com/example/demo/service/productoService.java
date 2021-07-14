package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Producto;



public interface productoService {
	
	public List<Producto> retrieveProdcuto();
	
	 public Producto getProducto(Long productoId);
	  
	 public void saveProducto(Producto producto);
	  
	

}
