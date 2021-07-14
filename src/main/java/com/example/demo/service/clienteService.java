package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cliente;


public interface clienteService {
	
	
	public List<Cliente> retrieveCliente();
	
	 public Cliente getCliente(Long  ClienteId);
	  
	 public void saveCliente(Cliente Cliente);
	  
	

}
