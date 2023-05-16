package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Auriculares;
import com.example.demo.repositories.AuricularesRepository;

public class AuricularesService {
	@Autowired
	AuricularesRepository auricularesRepository;

	public ArrayList<Auriculares> obtenerAuriculares() {
		return (ArrayList<Auriculares>) auricularesRepository.findAll();
	}

	public Auriculares guardarAuriculares(Auriculares auriculares) {
		return auricularesRepository.save(auriculares);
	}

	public Optional<Auriculares> obtenerPorId(Long id) {
		return auricularesRepository.findById(id);
	}

	public ArrayList<Auriculares> obtenerPorNombre(String nombreAuriculare) {
		return (ArrayList<Auriculares>) auricularesRepository.findByNombreAuriculare(nombreAuriculare);
	}

	public boolean eliminarAuriculares(Long id) {
		try {
			auricularesRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}

}
