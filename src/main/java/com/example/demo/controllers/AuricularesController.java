package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Auriculares;
import com.example.demo.services.AuricularesService;

@RestController // la notacion para decir que es un controller
@RequestMapping("/auriculares")
public class AuricularesController {
	@Autowired // inyectamos el service
	AuricularesService auricularesService;

	@GetMapping() // para el GET
	public ArrayList<Auriculares> obtenerAuriculares() {
		return auricularesService.obtenerAuriculares();
	}

	@PostMapping() // para el POST
	public Auriculares guardarAuriculares(@RequestBody Auriculares auriculares) {
		return this.auricularesService.guardarAuriculares(auriculares);
	}

	@GetMapping(path = "/{id}") // otro GET
	public Optional<Auriculares> obtenerPorId(@PathVariable("id") Long id) {
		return this.auricularesService.obtenerPorId(id);
	}

	@GetMapping("/query") // otro GET
	public ArrayList<Auriculares> obtenerAuricularesPorNombre(@RequestParam("nombre") String Nombre) {
		return this.auricularesService.obtenerPorNombre(Nombre);
	}

	@DeleteMapping(path = "/{id}") // para el DELETE
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.auricularesService.eliminarAuriculares(id);
		if (ok) {
			return "Se eliminó el Auricular con id " + id;
		} else {
			return "No se pudo eliminar el Auricular con id " + id;
		}
	}

}
