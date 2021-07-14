package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="PRODUCTO")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productoId")
	private long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre; 
	
	@Column(name = "precio", nullable = false)
	private Double precio; 
	
	@Column(name = "stock", nullable = false)
	private Double stock;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	@JsonIgnoreProperties("producto")
    private List<Detalle> detalleFactura;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Double getStock() {
		return stock;
	}


	public void setStock(Double stock) {
		this.stock = stock;
	}


	public List<Detalle> getDetalleFactura() {
		return detalleFactura;
	}


	public void setDetalleFactura(List<Detalle> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}
	

}
