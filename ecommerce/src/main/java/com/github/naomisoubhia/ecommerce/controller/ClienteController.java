package com.github.naomisoubhia.ecommerce.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.naomisoubhia.ecommerce.controller.dto.cliente.ClienteRequestCreate;
import com.github.naomisoubhia.ecommerce.controller.dto.cliente.ClienteRequestUpdate;
import com.github.naomisoubhia.ecommerce.controller.dto.cliente.SearchedCliente;
import com.github.naomisoubhia.ecommerce.model.Cliente;
import com.github.naomisoubhia.ecommerce.repository.ClienteRepository;
import com.github.naomisoubhia.ecommerce.service.ClienteService;




@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<SearchedCliente> listAll() {
		List<SearchedCliente> result = 
				clienteService.list()
				.stream()
				.map(SearchedCliente::toDto)
				.collect(Collectors.toList());
		return result;
	}

	@PostMapping	
	public Cliente create(@RequestBody ClienteRequestCreate dto) {

		
		Cliente cliente = new Cliente();
		
		cliente.setNome(dto.getNome());
		cliente.setCep(dto.getCep());	
		cliente.setInscricao_federal(dto.getInscricao_federal());
		
		Cliente result = clienteService.save(cliente);
		return result;
	}

	@PutMapping
	public Cliente update(Long codigo_cliente,@RequestBody ClienteRequestUpdate dto) {
		
		boolean exists =
				clienteRepository.existsById(dto.getCodigo_cliente());
		
		if (!exists) {
			throw new RuntimeException("Id não encontrado " 
							+ dto.getCodigo_cliente());			
		}
		Cliente cliente = new Cliente();

		cliente.setCodigo_cliente(dto.getCodigo_cliente());
		cliente.setNome(dto.getNome());
		cliente.setCep(dto.getCep());	
		cliente.setInscricao_federal(dto.getInscricao_federal());

		Cliente result = clienteService.save(cliente);
		return result;
	}

	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long codigo_cliente) {
		clienteRepository.deleteById(codigo_cliente);		
	}

}
