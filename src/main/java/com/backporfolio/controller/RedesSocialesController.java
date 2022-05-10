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
import com.backporfolio.model.RedesSociales;
import com.backporfolio.service.redesSociales.RedesService;

@RestController
@RequestMapping("api/redes")
@CrossOrigin(origins = { "https://porfoliogp.web.app", "https://porfoliogp.firebaseapp.com" })
public class RedesSocialesController {
	@Autowired
	private RedesService redesSvc;

	@GetMapping
	public ResponseEntity<List<RedesSociales>> getAllRedes() {
		return ResponseEntity.ok(redesSvc.getAllRedes());
	}

	@PostMapping("/add")
	public ResponseEntity<RedesSociales> addProy(@RequestBody RedesSociales redes) {
		return ResponseEntity.ok(redesSvc.saveRedes(redes));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProyecto(@PathVariable Long id) {
		redesSvc.deleteRedes(id);
		return new ResponseEntity(new Mensaje("Eliminada Correctamente"), HttpStatus.OK);
	}

	@PutMapping()
	public ResponseEntity<RedesSociales> UpdateProy(@RequestBody RedesSociales redes) {
		return ResponseEntity.ok(redesSvc.saveRedes(redes));
	}
}
