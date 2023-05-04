package com.example.demo.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Tablets extends MovilModel {
	private int tamanoPantalla;
	private String sistemaOperativa;

	public Tablets() {
		super();
	}

	public Tablets(String modelo, MarcaModel marca, ProcesadorModel procesador, PantallaModel pantalla,
			int almacenamiento, int ram, int alto, int ancho, int grosor, int peso, int camara, int bateria,
			boolean nfc, float precio, LocalDate fecha_lanzamiento) {
	}

	public String getSistemaOperativo() {
		return sistemaOperativa;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativa = sistemaOperativo;
	}

}
