package com.github.naomisoubhia.ecommerce.controller.dto.cliente;

import com.github.naomisoubhia.ecommerce.model.Cliente;

public class SearchedCliente {
	private Long codigo_cliente;
	private String nome;
	
	
	public Long getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public static SearchedCliente toDto(Cliente cliente) {
		SearchedCliente dto = new SearchedCliente();
		dto.setCodigo_cliente(cliente.getCodigo_cliente());
		dto.setNome(cliente.getNome());		
		return dto;
	}


}
