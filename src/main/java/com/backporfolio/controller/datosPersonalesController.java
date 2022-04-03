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

import com.backporfolio.model.DatosPersonales;
import com.backporfolio.service.datosPersonales.DatosPersonalesService;

@RestController
@RequestMapping("api/datosper")
public class datosPersonalesController {

	@Autowired
	private DatosPersonalesService datospSvc;

	@GetMapping("{id}")
	public ResponseEntity<List<DatosPersonales>> getDatosPer(@PathVariable Long id) {

		return ResponseEntity.ok(datospSvc.getDatosP(id));
	}

	@PostMapping("/add")
	@CrossOrigin
	public ResponseEntity<DatosPersonales> saveDatosPer(@RequestBody DatosPersonales datosp) {

		datospSvc.saveDatosP(datosp);
		return ResponseEntity.ok(datosp);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDatosPer(@PathVariable Long id) {
		datospSvc.deleteDatosP(id);
		return ResponseEntity.ok("eliminado correctamente");
	}

	@PutMapping()
	public ResponseEntity<DatosPersonales> updateDatosPer(@RequestBody DatosPersonales datosp) {
		datospSvc.saveDatosP(datosp);
		return ResponseEntity.ok(datosp);
	}
}
