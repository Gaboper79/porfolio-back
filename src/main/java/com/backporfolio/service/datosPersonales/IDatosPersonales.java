package com.backporfolio.service.datosPersonales;

import com.backporfolio.model.DatosPersonales;

public interface IDatosPersonales {
	public DatosPersonales getDatosP(Long id);

	public void saveDatosP(DatosPersonales datosP);

	public void deleteDatosP(Long id);

}
