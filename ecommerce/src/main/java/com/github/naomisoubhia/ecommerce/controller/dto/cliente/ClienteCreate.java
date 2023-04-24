package com.github.naomisoubhia.ecommerce.controller.dto.cliente;


public class ClienteCreate {

	private String nome;
	private Long inscricao_federal;
	private Long cep;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getInscricao_federal() {
		return inscricao_federal;
	}
	public void setInscricao_federal(Long inscricao_federal) {
		this.inscricao_federal = inscricao_federal;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	
	

}
