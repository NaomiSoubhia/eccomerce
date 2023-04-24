package com.github.naomisoubhia.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.naomisoubhia.ecommerce.model.Cliente;


@Repository
public interface ClienteRepository 
	extends JpaRepository<Cliente, Long> {

}
