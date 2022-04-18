package com.backporfolio.service.datosPersonales;

import java.util.List;

import com.backporfolio.model.DatosPersonales;

public interface IDatosPersonales {
	public List<DatosPersonales> getDatosP();

	public void saveDatosP(DatosPersonales datosP);

	public void deleteDatosP(Long id);

	public DatosPersonales findByID(Long id);

}
