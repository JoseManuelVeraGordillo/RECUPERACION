package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ObjectMother.FundaObjectMother;
import com.example.demo.ObjectMother.MovilModelObjectMother;
import com.example.demo.models.Funda;
import com.example.demo.models.MovilModel;
import com.example.demo.models.Smartphone;

import jakarta.transaction.Transactional;

@SpringBootTest
class FundaMovilRepositoryTest {
	@Autowired
	FundaRepository fundaRepository;
	@Autowired
	SmartphoneRepository smartphoneRepository;

	@Transactional
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

		List<Funda> fundas = new FundaObjectMother().getFundas();
		for (Funda funda : fundas) {
			fundaRepository.save(funda);
		}
		Funda fundaZero = fundas.get(0);
		fundaZero.add(smartphones.get(0));
		fundaZero.add(smartphones.get(1));
		fundaRepository.save(fundaZero);
		Funda fundaUno = fundaRepository.findById(1L).get();
		fundaUno.setModeloFunda("DE PATATAS FRITAS");
		fundaRepository.save(fundaUno);
		System.out.println();

	}
}
