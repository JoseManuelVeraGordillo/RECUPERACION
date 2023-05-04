package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ObjectMother.FundaObjectMother;
import com.example.demo.models.Funda;

@SpringBootTest
class FundaRepositoryTest {
	@Autowired
	FundaRepository fundaRepository;

	@Test
	void test() {
		List<Funda> fundas = new FundaObjectMother().getFundas();
		for (Funda funda : fundas) {
			fundaRepository.save(funda);
		}
		Iterable<Funda> findAll = fundaRepository.findAll();
		Iterator<Funda> iterator = findAll.iterator();
		System.out.println();

	}
}
