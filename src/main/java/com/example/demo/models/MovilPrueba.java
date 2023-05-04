package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MovilPrueba {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;
	private String nombre;
	@ManyToOne
	private MarcaModel marcaModel;

	public MovilPrueba(String nombre, MarcaModel marcaModel) {
		super();
		this.nombre = nombre;
		this.marcaModel = marcaModel;
	}

	public MovilPrueba() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MarcaModel getMarcaModel() {
		return marcaModel;
	}

	public void setMarcaModel(MarcaModel marcaModel) {
		this.marcaModel = marcaModel;
	}

}
