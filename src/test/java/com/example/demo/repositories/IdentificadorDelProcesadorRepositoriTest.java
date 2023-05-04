package com.example.demo.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;

import com.example.demo.ObjectMother.IdentificadorDelProcesadorObjectMother;
import com.example.demo.models.IdentificadorDelProcesador;
import com.example.demo.models.MarcaModel;
import com.example.demo.models.MovilModel;
import com.example.demo.models.ProcesadorModel;
import com.example.demo.models.Smartphone;

import jakarta.transaction.Transactional;

@SpringBootTest
class IdentificadorDelProcesadorRepositoriTest {
	@Autowired
	IdentificadorDelProcesadorRepository identificadorDelProcesadorRepository;
	@Autowired
	ProcesadorRepository procesadorRepository;

	// @Transactional para la def la conexion y la persitencia INTEGRA de los datos
	@Commit // la funcion contraria sera la de @Rollback solo para test
	@Test
	void test() {

		LinkedList<ProcesadorModel> procesadorModels = new LinkedList<>();
		procesadorModels.add(new ProcesadorModel("ARM", 4, 2.5F));
		procesadorModels.add(new ProcesadorModel("ARM II", 4, 3.5F));

		List<IdentificadorDelProcesador> identificador = new IdentificadorDelProcesadorObjectMother()
				.getIdentificadorDelProcesadors();

		for (IdentificadorDelProcesador identificadorDelProcesador : identificador) {

			identificadorDelProcesadorRepository.save(identificadorDelProcesador);
		}

		List<IdentificadorDelProcesador> identificadoresModelSave = identificadorDelProcesadorRepository.findAll();

		for (ProcesadorModel procesadorModel : procesadorModels) {

			// procesadorModel.setIdentificadorDelProcesador(identificadoresModelSave.get(0));

			procesadorRepository.save(procesadorModel);
		}
		List<ProcesadorModel> procesadorModelsSave = procesadorRepository.findAll();
		ProcesadorModel procesadorZero = procesadorModelsSave.get(0);
		procesadorZero.setIdentificadorDelProcesador(identificadoresModelSave.get(0));
		ProcesadorModel procesadorOne = procesadorModelsSave.get(1);
		procesadorZero.setIdentificadorDelProcesador(identificadoresModelSave.get(1));

		procesadorRepository.save(procesadorZero);
		procesadorRepository.save(procesadorOne);

	}
}
