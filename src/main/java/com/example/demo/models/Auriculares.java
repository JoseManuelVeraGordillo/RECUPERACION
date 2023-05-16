package com.example.demo.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Auriculares {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombreAuriculare;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(name = "MI_CONEXION", joinColumns = @JoinColumn(name = "MIS_auriculares_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "MIS_smartphone_id", referencedColumnName = "modelo"))

	private Set<Smartphone> smartphone = new HashSet<>();

	public Smartphone[] toArray() {
		return (Smartphone[]) smartphone.toArray();
	}

	public String getNombreAuriculare() {
		return nombreAuriculare;
	}

	public void setNombreAuriculare(String nombreAuriculare) {
		this.nombreAuriculare = nombreAuriculare;
	}

	public boolean add(Smartphone e) {
		return smartphone.add(e);
	}

	public Auriculares() {
		super();
	}

	public Auriculares(String nombreAuriculare) {
		super();
		this.nombreAuriculare = nombreAuriculare;
	}

	public void setSmartphone(Set<Smartphone> smartphones) {
		if (smartphones == null) {
			throw new IllegalArgumentException("La lista de smartphones no puede ser nula.");
		}
		this.smartphone = smartphone;
	}
}
