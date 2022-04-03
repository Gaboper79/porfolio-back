package com.backporfolio.service.experiencia;

import java.util.List;

import com.backporfolio.model.Experiencia;

public interface IExperienciaService {
	public List<Experiencia> getAllExperiencia();

	public Experiencia saveExperiencia(Experiencia experiencia);

	public void deleteExperiencia(Long id);

	public Experiencia findById(Long id);
}
