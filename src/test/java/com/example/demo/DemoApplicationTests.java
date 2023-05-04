package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.MovilModel;
import com.example.demo.models.MovilModelOM;
import com.example.demo.repositories.MovilRepositoy;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MovilRepositoy movilRepositoy;
	
//	@Test
//	void contextLoads() {
//		MovilModelOM om = new MovilModelOM();
//		List<MovilModel> moviles = om.getMoviles();  
//		movilRepositoy.saveAll(moviles);
//	}

}
