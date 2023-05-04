package com.example.demo.ObjectMother;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.models.MarcaModel;
import com.example.demo.models.PantallaModel;
import com.example.demo.models.ProcesadorModel;
import com.example.demo.models.Smartphone;

@Service
public class SmartphoneObjectMother {


	
	
	//	public static Set<Smartphone> createSmartphones() {
//		Set<Smartphone> smartphones = new HashSet<>();
//		smartphones.add(SmartphoneObjectMother.createIPhone12());
//		smartphones.add(SmartphoneObjectMother.createSamsungGalaxyS21());
//		return smartphones;
//	}
//
//	public static Smartphone createSamsungGalaxyS21() {
//		Smartphone smartphone = new Smartphone();
//
//		smartphone.setAlmacenamiento(256);
//		smartphone.setModelo((long) 1);
//		smartphone.setRam(16);
//		smartphone.setAlto(4);
//		smartphone.setAncho(8);
//		smartphone.setBateria(2);
//		smartphone.setCamara(1);
//		smartphone.setFecha_lanzamiento(null);
//		smartphone.setGrosor(16);
//		smartphone.setMarca(new MarcaModel("Xiaomi"));
//		smartphone.setModelo((long) 1);
//		smartphone.setNfc(true);
//		smartphone.setPantalla(new PantallaModel(12, "Super-Amoled"));
//		smartphone.setPeso(200);
//		smartphone.setPrecio(1200);
//		smartphone.setProcesador(new ProcesadorModel("One Pelotilla", 8, 16));
//		smartphone.setRam(256);
//		smartphone.setSistemaOperativo("Android");
//		return smartphone;
//	}
//
//	public static Smartphone createIPhone12() {
//		Smartphone smartphone = new Smartphone();
//
//		smartphone.getAlmacenamiento(256);
//		smartphone.setModelo((long) 1);
//		smartphone.setRam(16);
//		smartphone.setAlto(4);
//		smartphone.setAncho(8);
//		smartphone.setBateria(2);
//		smartphone.setCamara(1);
//		smartphone.setFecha_lanzamiento(null);
//		smartphone.setGrosor(16);
//		smartphone.setMarca(new MarcaModel("Appel"));
//		smartphone.setModelo((long) 1);
//		smartphone.setNfc(true);
//		smartphone.setPantalla(new PantallaModel(12, "Amoled"));
//		smartphone.setPeso(200);
//		smartphone.setPrecio(1200);
//		smartphone.setProcesador(new ProcesadorModel("Chuipipiruli", 8, 16));
//		smartphone.setRam(256);
//		smartphone.setSistemaOperativo("iOs");
//		return smartphone;
//	}
}
