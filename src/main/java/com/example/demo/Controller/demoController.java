package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Cliente;
import com.example.demo.model.Detalle;
import com.example.demo.model.Factura;
import com.example.demo.model.Producto;
import com.example.demo.service.clienteService;
import com.example.demo.service.detalleService;
import com.example.demo.service.facturaService;
import com.example.demo.service.productoService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class demoController {

	
	
	@Autowired
	clienteService clienteservice;
	
	@Autowired
	detalleService detalleservice;
	
	
	@Autowired
	facturaService facturaservice;
	
	@Autowired
	productoService productoservice;
	
	
	
	@GetMapping("/cliente")
	 public List<Cliente> getPersona() {
	  List<Cliente> employees = clienteservice.retrieveCliente();
	  return employees;
	 }
	 
	 @GetMapping("/cliente/{clienteId}")
	 public Cliente getPersona(@PathVariable(name="clienteId")Long employeeId) {
	  return clienteservice.getCliente(employeeId);
	 }
	 @PostMapping(path="/cliente",consumes="application/json")
	 public ResponseEntity<String> saveCliente(@RequestBody Cliente employee){
		 clienteservice.saveCliente(employee);
	  System.out.println("Cliente Saved Successfully");
	  return new ResponseEntity(HttpStatus.OK);
	 }
	//------------------------------------------------------------------------------- 
	 
	 @GetMapping("/detalle")
	 public List<Detalle> getDetalle() {
	  List<Detalle> employees = detalleservice.retrieveDetalle();
	  return employees;
	 }
	 
	 @GetMapping("/detalle/{detalleId}")
	 public Detalle getDetalle(@PathVariable(name="detalleId")Long employeeId) {
	  return detalleservice.getDetalle(employeeId);
	 }
	 @PostMapping(path="/detalle",consumes="application/json")
	 public ResponseEntity<String> saveDetalle(@RequestBody Detalle employee){
		 detalleservice.saveDetalle(employee);
	  System.out.println("Detalle Saved Successfully");
	  return new ResponseEntity(HttpStatus.OK);
	 }
	 
	 
	//------------------------------------------------------------------------------- 
	 
		 @GetMapping("/factura")
		 public List<Factura> getFactrua() {
		  List<Factura> employees = facturaservice.retrieveFactura();
		  return employees;
		 }
		 
		 @GetMapping("/factura/{facturaId}")
		 public Factura getFactura(@PathVariable(name="facturaId")Long employeeId) {
		  return facturaservice.getFactura(employeeId);
		 }
		 @PostMapping(path="/factura",consumes="application/json")
		 public ResponseEntity<String> saveFactura(@RequestBody Factura employee){
			 facturaservice.saveFactura(employee);
		  System.out.println("Factura Saved Successfully");
		  return new ResponseEntity(HttpStatus.OK);
		 }
		 
		//---------------------------------------------------------------------------------------- 
		 @GetMapping("/producto")
		 public List<Producto> getProducto() {
		  List<Producto> employees = productoservice.retrieveProdcuto();
		  return employees;
		 }
		 
		 @GetMapping("/producto/{productoId}")
		 public Producto getProducto(@PathVariable(name="productoId")Long employeeId) {
		  return productoservice.getProducto(employeeId);
		 }
		 @PostMapping(path="/producto",consumes="application/json")
		 public ResponseEntity<String> saveProducto(@RequestBody Producto employee){
			 productoservice.saveProducto(employee);
		  System.out.println("Producto Saved Successfully");
		  return new ResponseEntity(HttpStatus.OK);
		 }
}
