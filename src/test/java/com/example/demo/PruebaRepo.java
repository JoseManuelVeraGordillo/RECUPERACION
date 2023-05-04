package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.MarcaModel;
import com.example.demo.models.MovilModel;
import com.example.demo.repositories.MovilRepositoy;


@SpringBootTest
class PruebaRepo {
	@Autowired //revisar
	private MovilRepositoy movilRepositoy;
	
//	@Test
//	void test() {
//this.movilRepositoy.save(new MovilModel("A12", new  MarcaModel("Nokia") , null, null, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null));
//MovilModel movilModel = this.movilRepositoy.findById("A12").get();
//assertEquals("Nokia", movilModel.getMarca().getNombre());
////	this.movilRepositoy.findByCamara(0); //NUL
//	}

}
