package com.backporfolio.service.proyectos;

import java.util.List;

import com.backporfolio.model.Proyecto;

public interface IProyectoService {
	public List<Proyecto> getAllProyecto();

	public Proyecto saveProyecto(Proyecto proyecto);

	public void deleteProyecto(Long id);

	public Proyecto findById(Long id);

}
