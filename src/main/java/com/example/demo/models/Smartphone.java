package com.example.demo.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;

@Entity
public class Smartphone extends MovilModel {

	private String sistemaOperativo;

	@ManyToMany(mappedBy = "smartphone", fetch = FetchType.EAGER) // ojo prueba, no chirria, de entrada
	private Set<Auriculares> auricularess;

	public Smartphone() {
		super();
	}

//	public Smartphone(String modelo, MarcaModel marca, ProcesadorModel procesador, PantallaModel pantalla,
//			int almacenamiento, int ram, int alto, int ancho, int grosor, int peso, int camara, int bateria,
//			boolean nfc, float precio, LocalDate fecha_lanzamiento) {
//		super(modelo, marca, procesador, pantalla, almacenamiento, ram, alto, ancho, grosor, peso, camara, bateria, nfc,
//				precio, fecha_lanzamiento);
//		this.sistemaOperativo = sistemaOperativo;
//	}

	public Smartphone(Long id, String modelo, MarcaModel marca, ProcesadorModel procesador, PantallaModel pantalla,
			List<Funda> fundas, int almacenamiento, int ram, int alto, int ancho, int grosor, int peso, int camara,
			int bateria, boolean nfc, float precio, LocalDate fecha_lanzamiento) {
		super(id, modelo, marca, procesador, pantalla, fundas, almacenamiento, ram, alto, ancho, grosor, peso, camara,
				bateria, nfc, precio, fecha_lanzamiento);
		// TODO Auto-generated constructor stub
	}

	public Smartphone(String modelo, MarcaModel marca, ProcesadorModel procesador, PantallaModel pantalla,
			int almacenamiento, int ram, int alto, int ancho, int grosor, int peso, int camara, int bateria,
			boolean nfc, float precio, LocalDate fecha_lanzamiento, String sistemaOperativo2) {
		// TODO Auto-generated constructor stub
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

}
