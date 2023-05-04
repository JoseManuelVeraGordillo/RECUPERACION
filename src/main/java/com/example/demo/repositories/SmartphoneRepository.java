package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Smartphone;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Long> {

	public List<Smartphone> findAll();
}
