package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Auriculares;

public interface AuricularesRepository extends CrudRepository<Auriculares, Long> {

	public List<Auriculares> findAll();

	public List<Auriculares> findByNombreAuriculare(String nombreAuriculare);
}
