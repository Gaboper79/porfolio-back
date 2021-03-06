package com.backporfolio.service.datosPersonales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.model.DatosPersonales;
import com.backporfolio.repository.DatosPerRepository;

@Service
public class DatosPersonalesService implements IDatosPersonales {

	@Autowired
	private DatosPerRepository datosPRepo;

	@Override
	public List<DatosPersonales> getDatosP() {

		return datosPRepo.findAll();
	}

	@Override
	public void saveDatosP(DatosPersonales datosP) {
		System.out.println("llega el put");
		datosPRepo.save(datosP);

	}

	@Override
	public void deleteDatosP(Long id) {
		datosPRepo.deleteById(id);

	}

	@Override
	public DatosPersonales findByID(Long id) {

		return datosPRepo.findById(id).orElse(null);
	}

}
