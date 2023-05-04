package com.example.demo.ObjectMother;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.IdentificadorDelProcesador;
import com.example.demo.models.ProcesadorModel;

public class IdentificadorDelProcesadorObjectMother {

	public List<IdentificadorDelProcesador> getIdentificadorDelProcesadors() {
		ArrayList<IdentificadorDelProcesador> identifiDelProcesadorAL = new ArrayList<>();
		String[] nombreProcesador = { "A123", "B456", "C789" };
		for (String string : nombreProcesador) {
			identifiDelProcesadorAL.add(new IdentificadorDelProcesador(string));
		}
		return identifiDelProcesadorAL;
	}

}