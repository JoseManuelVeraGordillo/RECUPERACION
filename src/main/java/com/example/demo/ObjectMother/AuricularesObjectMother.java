package com.example.demo.ObjectMother;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.demo.models.Auriculares;
import com.example.demo.models.Smartphone;

public class AuricularesObjectMother {

	public List<Auriculares> getAuricularess() {
		ArrayList<Auriculares> auricularesArrayList = new ArrayList<>();
//		String[] nombreAuriculare = { "Aipods", "Miltel", "True Wireles", "Tempest gaming", "Beats Pro",
//				"Susvara HiFiMAN" };
		String[] nombreAuriculare = { "Aipods", "Miltel" };
		for (String string : nombreAuriculare) {
			auricularesArrayList.add(new Auriculares(string));
		}
		return auricularesArrayList;
	}

}