package com.example.demo.ObjectMother;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.ProcesadorModel;

public class ProcesadorModelObjectMother {
	public List<ProcesadorModel> getProcesadorModels() {
		ArrayList<ProcesadorModel> nombreProcesadores = new ArrayList<>();
		String[] nombres = { "Sansung Exynos 2200", "Qualcomm Snapdragon 8 Gen 2" };
		for (String string : nombres) {
			nombreProcesadores.add(new ProcesadorModel(string, 8, 128));
		}
		return nombreProcesadores;
	}
}
