package com.github.naomisoubhia.ecommerce.controller.dto.produto;

import com.github.naomisoubhia.ecommerce.model.Produto;

public class SearchedProduto {
    private Long codigo_produto;
	private String nome;
	
	
	public Long getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(Long codigo_produto) {
		this.codigo_produto = codigo_produto;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public static SearchedProduto toDto(Produto produto) {
		SearchedProduto dto = new SearchedProduto();
		dto.setCodigo_produto(produto.getCodigo_produto());
		dto.setNome(produto.getNome());		
		return dto;
	}


}
