package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ObjectMother.FundaObjectMother;
import com.example.demo.models.Funda;
import com.example.demo.models.MovilModel;
import com.example.demo.models.Smartphone;

@SpringBootTest
class FundaRepositoryTest {
	@Autowired
	FundaRepository fundaRepository;
	@Autowired
	MovilRepositoy movilRepositoy;
//@Autowired
//	SmartphoneRepository smartphoneRepository;

	@Test
	void test() {

		LinkedList<MovilModel> movilModels = new LinkedList<>();
		for (MovilModel movilModel : movilModels) {
			movilRepositoy.save(movilModel);
		}

		List<Funda> fundas = new FundaObjectMother().getFundas();
		for (Funda funda : fundas) {
			fundaRepository.save(funda);
		}

		Funda fundaZero = fundas.get(0);

		fundaZero.add(movilModels.get(0));
		fundaZero.add(movilModels.get(1));
		fundaRepository.save(fundaZero);
		
		List<MovilModel> findById=movilRepositoy.findAll();
		System.out.println(findById.toString());
		System.out.println();
	}
//		LinkedList<Smartphone> smartphones = new LinkedList<>(); // creamos nuestros smarphones
//		smartphones.add(new Smartphone());
//		smartphones.add(new Smartphone());
//		smartphones.add(new Smartphone());
//		smartphones.add(new Smartphone());
//		smartphones.add(new Smartphone());
//
//		for (Smartphone smartphone : smartphones) {// persitimos nuestros smarphones
//			smartphoneRepository.save(smartphone);
//
//		}
//
//		movilModels.add(new MovilModel());
//		movilModels.add(new MovilModel());
//		movilModels.add(new MovilModel());
//		movilModels.add(new MovilModel());
//		movilModels.add(new MovilModel());
//		Iterable<Funda> findAll = fundaRepository.findAll();
//		Iterator<Funda> iterator = findAll.iterator();
//		System.out.println();
//		fundaZero.add(movilModels.get(2));
//		fundaZero.add(movilModels.get(3));
//		fundaZero.add(movilModels.get(4));

}
