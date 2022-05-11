package com.backporfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backporfolio.cloudinary.dto.Mensaje;
import com.backporfolio.model.Proyecto;
import com.backporfolio.service.proyectos.ProyectoService;

@RestController
@CrossOrigin(origins = "https://porfoliogp-arprog.web.app")
@RequestMapping("api/proyecto")
public class ProyectoController {
	@Autowired
	private ProyectoService proySVC;

	@GetMapping
	public ResponseEntity<List<Proyecto>> getAllProy() {
		return ResponseEntity.ok(proySVC.getAllProyecto());
	}

	@PostMapping("/add")
	public ResponseEntity<Proyecto> addProy(@RequestBody Proyecto proy) {
		return ResponseEntity.ok(proySVC.saveProyecto(proy));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProyecto(@PathVariable Long id) {
		proySVC.deleteProyecto(id);
		return new ResponseEntity(new Mensaje("Eliminada Correctamente"), HttpStatus.OK);
	}

	@PutMapping()
	public ResponseEntity<Proyecto> UpdateProy(@RequestBody Proyecto proy) {
		return ResponseEntity.ok(proySVC.saveProyecto(proy));
	}
}
