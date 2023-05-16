package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ObjectMother.AuricularesObjectMother;
import com.example.demo.models.Auriculares;
import com.example.demo.models.Smartphone;

@SpringBootTest
class AuricularesRepositoryTest {
	@Autowired // Inyeccion de dependencias
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

		List<Auriculares> auriculares = new AuricularesObjectMother().getAuricularess();
		for (Auriculares auricularess : auriculares) {
			auricularesRepository.save(auricularess);
		}

		Auriculares auricularZero = auriculares.get(0);
		auricularZero.add(smartphones.get(0));
		auricularZero.add(smartphones.get(1));
		auricularesRepository.save(auricularZero);
		Auriculares auriculares2 = auricularesRepository.findById(1L).get();
		auriculares2.setNombreAuriculare("OTRO");
		auricularesRepository.save(auriculares2);
		System.out.println();
	}
}
