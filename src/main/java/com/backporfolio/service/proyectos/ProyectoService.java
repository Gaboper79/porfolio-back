package com.backporfolio.service.proyectos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.model.Proyecto;
import com.backporfolio.repository.ProyectoRepository;

@Service
public class ProyectoService implements IProyectoService {

	@Autowired
	private ProyectoRepository proyRepo;

	@Override
	public List<Proyecto> getAllProyecto() {

		return proyRepo.findAll();
	}

	@Override
	public Proyecto saveProyecto(Proyecto proyecto) {
		return proyRepo.save(proyecto);

	}

	@Override
	public void deleteProyecto(Long id) {
		proyRepo.deleteById(id);

	}

	@Override
	public Proyecto findById(Long id) {

		return proyRepo.findById(id).orElse(null);
	}

}
