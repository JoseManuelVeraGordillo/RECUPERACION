package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.IdentificadorDelProcesador;

public interface IdentificadorDelProcesadorRepository extends CrudRepository<IdentificadorDelProcesador, Long> {
	public List<IdentificadorDelProcesador> findAll();
}
