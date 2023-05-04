package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "procesador")
public class ProcesadorModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	private int nucleos;
	private float velocidad;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "identificadorDelProcesador_id", referencedColumnName = "id")
	private IdentificadorDelProcesador identificadorDelProcesador;

	public ProcesadorModel() {
		super();
	}

	public ProcesadorModel(String tipo, int nucleos, float velocidad) {
		super();
		this.tipo = tipo;
		this.nucleos = nucleos;
		this.velocidad = velocidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public IdentificadorDelProcesador getIdentificadorDelProcesador() {
		return identificadorDelProcesador;
	}

	public void setIdentificadorDelProcesador(IdentificadorDelProcesador identificadorDelProcesador) {
		this.identificadorDelProcesador = identificadorDelProcesador;
	}

}
