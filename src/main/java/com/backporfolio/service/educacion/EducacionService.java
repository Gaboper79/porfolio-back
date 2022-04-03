package com.backporfolio.service.educacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.model.Educacion;
import com.backporfolio.repository.EducacionRepository;

@Service
public class EducacionService implements IEducacionService {

	@Autowired
	private EducacionRepository eduRepo;

	@Override
	public List<Educacion> getAllEducaciones() {

		return eduRepo.findAll();
	}

	@Override
	public Educacion saveEducacion(Educacion educacion) {
		return eduRepo.save(educacion);

	}

	@Override
	public void deleteEducacion(Long id) {
		eduRepo.deleteById(id);

	}

	@Override
	public Educacion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
