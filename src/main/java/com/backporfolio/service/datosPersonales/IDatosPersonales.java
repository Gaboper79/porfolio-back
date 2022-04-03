package com.backporfolio.service.datosPersonales;

import java.util.List;

import com.backporfolio.model.DatosPersonales;

public interface IDatosPersonales {
	public List<DatosPersonales> getDatosP(Long id);

	public void saveDatosP(DatosPersonales datosP);

	public void deleteDatosP(Long id);

}
