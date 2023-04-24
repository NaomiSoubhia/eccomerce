package com.github.naomisoubhia.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.naomisoubhia.ecommerce.model.Cliente;
import com.github.naomisoubhia.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> list() {
		return clienteRepository.findAll();
	}
	
	public Cliente save(Cliente cliente) {			
		return clienteRepository.save(cliente);
	}
}
