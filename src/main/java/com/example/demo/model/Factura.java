package com.example.demo.model;

import java.util.Date;

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
@Table(name="FACTURA")
public class Factura {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "facturaId")
	private long id;
	
	
	@Column(name = "fechaFactura", nullable = false)
	private Date fechaFactura; 
	
	@ManyToOne(cascade={},fetch=FetchType.EAGER)
    @JoinColumn(name = "FK_CLIENTE", nullable = false, updatable = false)
    private Cliente cliente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
