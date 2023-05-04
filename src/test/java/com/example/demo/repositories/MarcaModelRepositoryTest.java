package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ObjectMother.MarcaModelObjectMother;
import com.example.demo.models.MarcaModel;

@SpringBootTest
class MarcaModelRepositoryTest {
	@Autowired
	MarcaModelRepository marcaModelRepository;

	@Test
	void test() {
		List<MarcaModel> marcaModels = new MarcaModelObjectMother().getMarcaModels();
		for (MarcaModel marcaModel : marcaModels) {
		marcaModelRepository.save(marcaModel);
		
		}
//		List<MarcaModel> marcaModelPersist=new ArrayList<>();
//		marcaModelRepository.findAll().forEach(marcaModelPersist::add); ;
//		List<MarcaModel> findAll = marcaModelRepository.findAll();
//		findAll.size();
		Iterable<MarcaModel> findAll = marcaModelRepository.findAll();
		Iterator<MarcaModel> iterator = findAll.iterator();
		System.out.println();
	}

}
