package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.example.demo.ObjectMother.AuricularesObjectMother;
import com.example.demo.models.Auriculares;
import com.example.demo.models.Smartphone;

import jakarta.transaction.Transactional;

@SpringBootTest
class AuricularesRepositoryTest {
	@Autowired
	AuricularesRepository auricularesRepository;
	@Autowired
	SmartphoneRepository smartphoneRepository;

//	@Transactional // solucion propuesta por ChatGPT3
	// @Commit
	@Test
	void test() {
		LinkedList<Smartphone> smartphones = new LinkedList<>(); // creamos nuestros smarphones
		smartphones.add(new Smartphone());
		smartphones.add(new Smartphone());
		smartphones.add(new Smartphone());
		smartphones.add(new Smartphone());
		smartphones.add(new Smartphone());

		for (Smartphone smartphone : smartphones) {// persitimos nuestros smarphones
			smartphoneRepository.save(smartphone);

		}
		List<Smartphone> smartphonesSave = smartphoneRepository.findAll();

		List<Auriculares> auriculares = new AuricularesObjectMother().getAuricularess();

		for (Auriculares auricularess : auriculares) {
//			auricularess.setNombreAuriculare("Prueba");
			auricularesRepository.save(auricularess);
			auricularess.setNombreAuriculare("Prueba");

		}
		List<Auriculares> auricularesSave = auricularesRepository.findAll();
//		Auriculares auricularZero = auricularesSave.get(0);
		Auriculares auricularZero = auriculares.get(0);

		auricularZero.add(smartphonesSave.get(0));
		auricularZero.add(smartphonesSave.get(1));

//		for (Auriculares auricularess : auricularesSave) {
//
//			auricularesRepository.save(auricularess);
//
//		}

		auricularZero.setNombreAuriculare("NOMBRE PRUEBA");
//		auricularesRepository.save(auricularZero);
		System.out.println();
	}

}
