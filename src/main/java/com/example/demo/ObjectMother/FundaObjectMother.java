package com.example.demo.ObjectMother;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Funda;
import com.example.demo.models.MovilModel;

public class FundaObjectMother {
	public List<Funda> getFundas() {
		ArrayList<Funda> fundasArrayList = new ArrayList<>();
		String[] nombrefundas = { "Funda de plastico", "Funda de goma", "Funda Bumper", "Funda Hibrida",
				"Funda de Madera", "Funda de Metal", "Funda de Cuero" };
		for (String string : nombrefundas) {
			fundasArrayList.add(new Funda(string));
		}
		return fundasArrayList;
	}

}