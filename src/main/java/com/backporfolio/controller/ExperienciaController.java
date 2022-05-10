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
import com.backporfolio.model.Experiencia;
import com.backporfolio.service.experiencia.ExperienciaService;

@RestController
@RequestMapping("api/experiencia")
@CrossOrigin(origins = { "https://porfoliogp.web.app", "https://porfoliogp.firebaseapp.com" })
public class ExperienciaController {
	@Autowired
	private ExperienciaService expSVC;

	@GetMapping

	public ResponseEntity<List<Experiencia>> getAllExp() {
		return ResponseEntity.ok(expSVC.getAllExperiencia());
	}

	@PostMapping("/add")

	public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia exp) {
		System.out.println(exp.getFechaIni());
		return ResponseEntity.ok(expSVC.saveExperiencia(exp));
	}

	@DeleteMapping("{id}")

	public ResponseEntity<String> deleteExperiencia(@PathVariable Long id) {
		expSVC.deleteExperiencia(id);

		return new ResponseEntity(new Mensaje("Eliminada Correctamente"), HttpStatus.OK);
	}

	@PutMapping()

	public ResponseEntity<Experiencia> UpdateExperiencia(@RequestBody Experiencia exp) {
		return ResponseEntity.ok(expSVC.saveExperiencia(exp));
	}
}
