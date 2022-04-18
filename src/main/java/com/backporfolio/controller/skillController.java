package com.backporfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.backporfolio.model.Skills;
import com.backporfolio.service.skill.SkillService;

@RestController
@RequestMapping("/api/skill")
@CrossOrigin
public class skillController {

	@Autowired
	private SkillService skillSvc;

	@GetMapping
	public ResponseEntity<List<Skills>> getAllSkill() {
		return ResponseEntity.ok(skillSvc.getAllskill());
	}

	@PostMapping("/add")
	public ResponseEntity<Skills> saveSkill(@RequestBody Skills skill) {

		skillSvc.saveSkill(skill);
		return ResponseEntity.ok(skill);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSkill(@PathVariable Long id) {
		skillSvc.deleteSkill(id);
		return ResponseEntity.ok("Eliminado Correctamente");
	}

	@PutMapping()
	public ResponseEntity<Skills> updateSkill(@RequestBody Skills skill) {

		skillSvc.saveSkill(skill);
		return ResponseEntity.ok(skill);
	}
}
