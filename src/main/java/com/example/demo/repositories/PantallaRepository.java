package com.example.demo.repositories;

import com.example.demo.models.PantallaModel;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PantallaRepository extends CrudRepository<PantallaModel, Long>{

//	public List<PantallaModel> findByTamano(float tamano);
//	
//	public List<PantallaModel> findByTecnologia(String tecnologia);
}
