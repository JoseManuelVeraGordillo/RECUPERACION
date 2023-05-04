package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.MarcaModel;
import com.example.demo.models.MovilPrueba;

@SpringBootTest
class MovilPruebaRepositoryTest {
	@Autowired
	MovilPruebaRepository movilPruebaRepository;

	@Autowired
	MarcaModelRepository marcaModelRepository;

	@Test
	void test() {
		MarcaModel marca = new MarcaModel("Motorola");
		marcaModelRepository.save(marca);
		MovilPrueba movilPrueba = new MovilPrueba("Tac", marca);
		movilPruebaRepository.save(movilPrueba);
		Optional<MovilPrueba> findById = movilPruebaRepository.findById(2l);

		MovilPrueba movilPrueba2;
		try {
			movilPrueba2 = findById.orElseThrow();
			System.err.println(movilPrueba2.getNombre());
		} catch (Exception e) {
			System.out.println("No EXISTE");
		}
	}

}
