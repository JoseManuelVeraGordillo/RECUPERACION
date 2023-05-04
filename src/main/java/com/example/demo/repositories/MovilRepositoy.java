package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MovilModel;

@Repository
public interface MovilRepositoy extends CrudRepository<MovilModel, Long> {

	public List<MovilModel> findAll();

	public List<MovilModel> findAllByPrecioBetween(float precioMin, float precioMax);

	public List<MovilModel> findByMarcaNombre(String marca);

	public List<MovilModel> findByCamara(int camara);

	public List<MovilModel> findByModeloIn(List<String> modelo);

	public List<MovilModel> findByMarcaNombreContainingAndPrecioBetweenAndRamBetweenAndNfcAndPantallaTecnologiaContaining(
			String nombreMarca, float precioMin, float precioMax, int ramMin, int ramMax, boolean nfc,
			String tecnologiaPantalla);

}
