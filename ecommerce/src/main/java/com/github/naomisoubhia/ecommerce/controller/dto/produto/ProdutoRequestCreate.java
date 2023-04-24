package com.github.naomisoubhia.ecommerce.controller.dto.produto;

import java.time.LocalDate;

public class ProdutoRequestCreate {
private String nome;
	
	private int preco;
	
	private LocalDate data_validade;
	
	private LocalDate data_garantia;
	
	private boolean emEstoque;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public LocalDate getData_validade() {
		return data_validade;
	}

	public void setData_validade(LocalDate data_validade) {
		this.data_validade = data_validade;
	}

	public LocalDate getData_garantia() {
		return data_garantia;
	}

	public void setData_garantia(LocalDate data_garantia) {
		this.data_garantia = data_garantia;
	}

	public boolean isEmEstoque() {
		return emEstoque;
	}

	public void setEmEstoque(boolean emEstoque) {
		this.emEstoque = emEstoque;
	}
	
	
	
}
