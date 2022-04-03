package com.backporfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backporfolio.model.Experiencia;
import com.backporfolio.service.experiencia.ExperienciaService;

@RestController
@RequestMapping("api/experiencia")
public class ExperienciaController {
	@Autowired
	private ExperienciaService expSVC;

	@GetMapping
	public ResponseEntity<List<Experiencia>> getAllExp() {
		return ResponseEntity.ok(expSVC.getAllExperiencia());
	}

	@PostMapping("/add")
	public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia exp) {
		return ResponseEntity.ok(expSVC.saveExperiencia(exp));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteExperiencia(@PathVariable Long id) {
		expSVC.deleteExperiencia(id);
		return ResponseEntity.ok("Eliminado Correctamente");
	}

	@PutMapping()
	public ResponseEntity<Experiencia> UpdateExperiencia(@RequestBody Experiencia edu) {
		return ResponseEntity.ok(expSVC.saveExperiencia(edu));
	}
}
