package com.backporfolio.service.educacion;

import java.util.List;

import com.backporfolio.model.Educacion;

public interface IEducacionService {
	public List<Educacion> getAllEducaciones();

	public Educacion saveEducacion(Educacion educacion);

	public void deleteEducacion(Long id);

	public Educacion findById(Long id);
}
