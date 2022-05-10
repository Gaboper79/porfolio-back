package com.backporfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
import com.backporfolio.model.Skills;
import com.backporfolio.service.skill.SkillService;

@RestController
@RequestMapping("/api/skill")
@CrossOrigin(origins = "https://porfoliogp.web.app")
public class skillController {

	@Autowired
	private SkillService skillSvc;

	@GetMapping
	public ResponseEntity<List<Skills>> getAllSkill() {
		return ResponseEntity.ok(skillSvc.getAllskill());
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/add")
	public ResponseEntity<Skills> saveSkill(@RequestBody Skills skill) {

		skillSvc.saveSkill(skill);
		return ResponseEntity.ok(skill);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSkill(@PathVariable Long id) {
		skillSvc.deleteSkill(id);
		return new ResponseEntity(new Mensaje("Eliminada Correctamente"), HttpStatus.OK);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping()
	public ResponseEntity<Skills> updateSkill(@RequestBody Skills skill) {

		skillSvc.saveSkill(skill);
		return ResponseEntity.ok(skill);
	}
}
