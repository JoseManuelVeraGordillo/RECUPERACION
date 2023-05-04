package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ProcesadorModel;

@Repository
public interface ProcesadorRepository extends CrudRepository<ProcesadorModel, Long> {

	public List<ProcesadorModel> findAll();
//	public List<ProcesadorModel> findByTipo(String tipo);
//
//	public List<ProcesadorModel> findByNucleos(int nucleos);
//
//	public List<ProcesadorModel> findByVelocidad(float velocidad);
}
