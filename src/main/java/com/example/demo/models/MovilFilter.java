package com.example.demo.models;

public class MovilFilter {

	private String marca = "any";
	Range<Float> precio = new Range<Float>(0f, 20000f);
	Range<Integer> ram = new Range<Integer>(1, 64);
	boolean nfc = false;
	String pantalla = "Any";

	public MovilFilter(String marca, Range<Float> precio, Range<Integer> ram, boolean nfc, String pantalla) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.ram = ram;
		this.nfc = nfc;
		this.pantalla = pantalla;
	}

	public MovilFilter(boolean b) {

	}

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}

	public Range<Float> getPrecio() {
		return precio;
	}

	public void setPrecio(Range<Float> precio) {
		this.precio = precio;
	}

	public Range<Integer> getRam() {
		return ram;
	}

	public void setRam(Range<Integer> ram) {
		this.ram = ram;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
