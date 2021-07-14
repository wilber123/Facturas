package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="DETALLE")
public class Detalle {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "detalleId")
	private long id;
	
	@Column(name = "cantidad", nullable = false)
	private Double cantidad; 
	
	@Column(name = "precio", nullable = false)
	private Double precio;
	
	@ManyToOne(cascade={},fetch=FetchType.EAGER)
    @JoinColumn(name = "FK_PRODUCTO", nullable = false, updatable = false)
    private Producto producto;
	
	@ManyToOne(cascade={},fetch=FetchType.EAGER)
    @JoinColumn(name = "FK_FACTURA", nullable = false, updatable = false)
    private Factura factura;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	
	
}
