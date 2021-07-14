package com.example.demo.serviceimple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.detalleRepository;
import com.example.demo.Repository.productoReposiroty;
import com.example.demo.model.Detalle;
import com.example.demo.model.Factura;
import com.example.demo.model.Producto;
import com.example.demo.service.productoService;


@Service
public class productoServiceImple implements  productoService{
	
	@Autowired
	private productoReposiroty pr;
	
	
	public void setDetalleRepositor(productoReposiroty detalle) {
		  this.pr = detalle;
		 }   

	@Override
	public List<Producto> retrieveProdcuto() {
		List<Producto> detalle = pr.findAll();
		  return detalle;
	}

	@Override
	public Producto getProducto(Long productoId) {
		 Optional<Producto> optEmp = pr.findById(productoId);
		  return optEmp.get();
	}

	@Override
	public void saveProducto(Producto producto) {
		pr.save(producto);
		
	}

	

} 
