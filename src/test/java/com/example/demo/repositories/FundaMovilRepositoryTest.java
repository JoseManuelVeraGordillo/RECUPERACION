package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ObjectMother.FundaObjectMother;
import com.example.demo.ObjectMother.MovilModelObjectMother;
import com.example.demo.models.Funda;
import com.example.demo.models.MovilModel;

@SpringBootTest
class FundaMovilRepositoryTest {
	@Autowired
	MovilRepositoy movilRepositoy;
	@Autowired
	FundaRepository fundaRepository;

	@Test
	void test() {
		
		List<MovilModel> movilModels=new MovilModelObjectMother().getMoviles();
		List<Funda> fundas = new FundaObjectMother().getFundas();
		for (Funda funda : fundas) {
			MovilModel save = movilRepositoy.save(new MovilModel());//persistencia del movil
			funda.setMovilModel(save);
			Funda fundaSave = fundaRepository.save(funda);//persistencia de la funda

		}
		Optional<MovilModel> findById = movilRepositoy.findById(1l);//busco un movil
		System.out.println();
	}

}
