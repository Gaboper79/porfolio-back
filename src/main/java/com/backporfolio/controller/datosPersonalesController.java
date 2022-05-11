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
@CrossOrigin(origins = { "https://porfoliogp-arprog.web.app", "http://localhost:4200" })
@RequestMapping("api/datosper")
public class datosPersonalesController {

	@Autowired
	private DatosPersonalesService datospSvc;

	@GetMapping()

	public ResponseEntity<List<DatosPersonales>> getDatosPer() {

		return ResponseEntity.ok(datospSvc.getDatosP());
	}

	@GetMapping("{id}")

	public ResponseEntity<DatosPersonales> getById(@PathVariable Long id) {

		return ResponseEntity.ok(datospSvc.findByID(id));
	}

	@PostMapping("/add")

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
		System.out.println("actualizo");
		datospSvc.saveDatosP(datosp);

		return ResponseEntity.ok(datosp);
	}
}
