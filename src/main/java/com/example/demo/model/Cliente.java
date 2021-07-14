package com.example.demo.model;

import java.util.Date;
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
@Table(name="CLIENTE")
public class Cliente {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "clienteId")
	private long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre; 
	
	@Column(name = "apellido", nullable = false)
	private String apellido; 
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@Column(name = "fechaNacimiento", nullable = false)
	private Date nacimiento; 
	
	@Column(name = "telefono", nullable = false)
	private String telefono; 
	
	@Column(name = "email", nullable = false)
	private String email;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	@JsonIgnoreProperties("cliente")
    private List<Factura> facturas;


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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Date getNacimiento() {
		return nacimiento;
	}


	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Factura> getFacturas() {
		return facturas;
	}


	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	
}
