package com.example.demo.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

//@Inheritance(strategy = InheritanceType.JOINED) 
// para varias tablas singel_table para solo una seria necesario
//ponerla en las hijas no el el padre?
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // para varias tablas SINGLE_TABLE para solo una
public abstract class MovilModel {

//public class MovilModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modelo;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_marca")
	private MarcaModel marca;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_procesador")
	private ProcesadorModel procesador;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_pantalla")
	private PantallaModel pantalla;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "movilModel", fetch = FetchType.EAGER)
	private List<Funda> fundas;
	private int almacenamiento;
	private int ram;
	private int alto;
	private int ancho;
	private int grosor;
	private int peso;
	private int camara;
	private int bateria;
	private boolean nfc;
	private float precio;
	private LocalDate fecha_lanzamiento;

	public MovilModel() {
		super();
	}

	public MovilModel(Long id, String modelo, MarcaModel marca, ProcesadorModel procesador, PantallaModel pantalla,
			List<Funda> fundas, int almacenamiento, int ram, int alto, int ancho, int grosor, int peso, int camara,
			int bateria, boolean nfc, float precio, LocalDate fecha_lanzamiento) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.procesador = procesador;
		this.pantalla = pantalla;
		this.fundas = fundas;
		this.almacenamiento = almacenamiento;
		this.ram = ram;
		this.alto = alto;
		this.ancho = ancho;
		this.grosor = grosor;
		this.peso = peso;
		this.camara = camara;
		this.bateria = bateria;
		this.nfc = nfc;
		this.precio = precio;
		this.fecha_lanzamiento = fecha_lanzamiento;
	}

//	public MovilModel(String modelo, MarcaModel marca, ProcesadorModel procesador, PantallaModel pantalla,
//			int almacenamiento, int ram, int alto, int ancho, int grosor, int peso, int camara, int bateria,
//			boolean nfc, float precio, LocalDate fecha_lanzamiento) {
//		super();
//		this.modelo = modelo;
//		this.marca = marca;
//		this.procesador = procesador;
//		this.pantalla = pantalla;
//		this.almacenamiento = almacenamiento;
//		this.ram = ram;
//		this.alto = alto;
//		this.ancho = ancho;
//		this.grosor = grosor;
//		this.peso = peso;
//		this.camara = camara;
//		this.bateria = bateria;
//		this.nfc = nfc;
//		this.precio = precio;
//		this.fecha_lanzamiento = fecha_lanzamiento;
//	}

	public MovilModelDTO movilDTO() {
		return new MovilModelDTO(String.valueOf(modelo), marca.getNombre(), procesador.getNucleos(), ram,
				almacenamiento, precio);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public MarcaModel getMarca() {
		return marca;
	}

	public void setMarca(MarcaModel marca) {
		this.marca = marca;
	}

	public ProcesadorModel getProcesador() {
		return procesador;
	}

	public void setProcesador(ProcesadorModel procesador) {
		this.procesador = procesador;
	}

	public PantallaModel getPantalla() {
		return pantalla;
	}

	public void setPantalla(PantallaModel pantalla) {
		this.pantalla = pantalla;
	}

	public int getAlmacenamiento(long id) {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getCamara() {
		return camara;
	}

	public void setCamara(int camara) {
		this.camara = camara;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public LocalDate getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}

	public void setFecha_lanzamiento(LocalDate fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}

}
