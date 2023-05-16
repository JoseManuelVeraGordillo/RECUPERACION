package com.example.demo.ObjectMother;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.demo.models.MarcaModel;
import com.example.demo.models.MovilModel;
import com.example.demo.models.PantallaModel;
import com.example.demo.models.ProcesadorModel;
import com.example.demo.models.Tablets;
import com.example.demo.models.Smartphone;

public class MovilModelObjectMother {

	public List<MovilModel> getMoviles() {
		List<MovilModel> movilesNuevos = new ArrayList<>();

		return movilesNuevos;
	}

	public MovilModel creamosIphone() {
		MovilModel movilModelNuevo = new MovilModel();
		movilModelNuevo.setModelo("12 Pro");
		movilModelNuevo.setAlmacenamiento(1);
		movilModelNuevo.setRam(16);
		movilModelNuevo.setAlto(4);
		movilModelNuevo.setAncho(8);
		movilModelNuevo.setBateria(2);
		movilModelNuevo.setCamara(1);
		movilModelNuevo.setFecha_lanzamiento(LocalDate.of(2022, 01, 01));
		movilModelNuevo.setGrosor(16);
		movilModelNuevo.setMarca(new MarcaModel("Appel"));
		movilModelNuevo.setNfc(true);
		movilModelNuevo.setPantalla(new PantallaModel(12, "Amoled"));
		movilModelNuevo.setPeso(200);
		movilModelNuevo.setPrecio(1200);
		movilModelNuevo.setProcesador(new ProcesadorModel("Chuipipiruli", 8, 16));
		movilModelNuevo.setRam(256);
		return movilModelNuevo;
	}
//	public List<MovilModel> getMoviles(){
//		ArrayList<MovilModel> movilModels =new ArrayList<>();
//		
//		//TODO que le paso? a que le meto el foreach?
//		return movilModels;	
//	}
//	

}