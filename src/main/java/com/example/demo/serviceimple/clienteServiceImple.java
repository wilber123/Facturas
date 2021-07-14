package com.example.demo.serviceimple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.clienteRepository;
import com.example.demo.model.Cliente;
import com.example.demo.service.clienteService;

@Service
public class clienteServiceImple implements clienteService{
	
	@Autowired
	private clienteRepository cr;

	@Override
	public List<Cliente> retrieveCliente() {
		List<Cliente> clientes = cr.findAll();
		  return clientes;
	}
	
	public void setClienteRepositor(clienteRepository cliente) {
		  this.cr = cliente;
		 }

	@Override
	public Cliente getCliente(Long clienteId) {
		 Optional<Cliente> optEmp = cr.findById(clienteId);
		  return optEmp.get();
	}

	@Override
	public void saveCliente(Cliente cliente) {
	cr.save(cliente);
		
	
		
	}

}
