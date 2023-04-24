package com.github.naomisoubhia.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.naomisoubhia.ecommerce.model.Produto;
import com.github.naomisoubhia.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> list() {
		return produtoRepository.findAll();
	}
	
	public Produto save(Produto produto) {			
		return produtoRepository.save(produto);
	}
}
