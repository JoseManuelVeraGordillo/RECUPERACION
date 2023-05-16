package com.example.demo.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Funda {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String modeloFunda;

	@ManyToOne
	@JoinColumn(name = "modelo_idZ")
	private MovilModel movilModel;

	public Funda() {
		super();
	}

	public Funda(String modeloFunda) {
		super();
		this.modeloFunda = modeloFunda;
	}

	public String getModeloFunda() {
		return modeloFunda;
	}

	public void setModeloFunda(String modeloFunda) {
		this.modeloFunda = modeloFunda;
	}

	public MovilModel getMovilModel() {
		return movilModel;
	}

	public void setMovilModel(MovilModel movilModel) {
		this.movilModel = movilModel;
	}

	private Set<MovilModel> movilModels = new HashSet<>();

	public Object[] toArray() {
		return movilModels.toArray();
	}

	public boolean add(MovilModel e) {
		return movilModels.add(e);
	}

	
}
