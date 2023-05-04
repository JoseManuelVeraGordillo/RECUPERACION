package com.example.demo.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "IdentificadorDelProcesador")
public class IdentificadorDelProcesador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String CodigoProcesador;

	@OneToOne(mappedBy = "identificadorDelProcesador")
	private ProcesadorModel procesadorModel;

	public IdentificadorDelProcesador() {
		super();
	}

	public IdentificadorDelProcesador(String codigoProcesador) {
		super();
		CodigoProcesador = codigoProcesador;
	}

	public IdentificadorDelProcesador(String codigoProcesador, ProcesadorModel procesadorModel) {
		super();
		CodigoProcesador = codigoProcesador;
		this.procesadorModel = procesadorModel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoProcesador() {
		return CodigoProcesador;
	}

	public void setCodigoProcesador(String codigoProcesador) {
		CodigoProcesador = codigoProcesador;
	}

	public ProcesadorModel getProcesadorModel() {
		return procesadorModel;
	}

	public void setProcesadorModel(ProcesadorModel procesadorModel) {
		this.procesadorModel = procesadorModel;
	}
}
