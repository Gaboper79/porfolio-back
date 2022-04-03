package com.backporfolio.service.experiencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.model.Experiencia;
import com.backporfolio.repository.ExperienciaReposirtory;

@Service
public class ExperienciaService implements IExperienciaService {

	@Autowired
	private ExperienciaReposirtory expRepo;

	@Override
	public List<Experiencia> getAllExperiencia() {

		return expRepo.findAll();
	}

	@Override
	public Experiencia saveExperiencia(Experiencia experiencia) {
		return expRepo.save(experiencia);

	}

	@Override
	public void deleteExperiencia(Long id) {
		expRepo.deleteById(id);

	}

	@Override
	public Experiencia findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
