package com.example.demo.ObjectMother;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.MarcaModel;

public class MarcaModelObjectMother {
	public  List<MarcaModel> getMarcaModels() {
		ArrayList<MarcaModel> marcamodelosArrayList=new ArrayList<>();
		String [] nombres= {"Xiaomi", "Appel","Lenovo", "Sony","PocoPhone"};
		for (String string : nombres) {
			marcamodelosArrayList.add(new MarcaModel(string));
		}
		return marcamodelosArrayList;
	}

}