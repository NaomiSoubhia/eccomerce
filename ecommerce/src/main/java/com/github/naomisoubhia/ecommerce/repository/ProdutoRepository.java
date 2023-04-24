package com.github.naomisoubhia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.naomisoubhia.ecommerce.model.Produto;


@Repository
public interface ProdutoRepository 
	extends JpaRepository<Produto, Long> {

}
