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
import com.backporfolio.model.Educacion;
import com.backporfolio.service.educacion.EducacionService;

@RestController
@RequestMapping("api/educacion")
@CrossOrigin
public class EducacionController {

	@Autowired
	private EducacionService eduSVC;

	@GetMapping
	public ResponseEntity<List<Educacion>> getAllEdu() {
		return ResponseEntity.ok(eduSVC.getAllEducaciones());
	}

	@PostMapping("/add")
	public ResponseEntity<Educacion> addEdu(@RequestBody Educacion edu) {
		return ResponseEntity.ok(eduSVC.saveEducacion(edu));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEdu(@PathVariable Long id) {
		eduSVC.deleteEducacion(id);
		return new ResponseEntity(new Mensaje("Eliminada Correctamente"), HttpStatus.OK);

	}

	@PutMapping()
	public ResponseEntity<Educacion> UpdateEdu(@RequestBody Educacion edu) {
		return ResponseEntity.ok(eduSVC.saveEducacion(edu));
	}
}
