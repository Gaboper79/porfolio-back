package com.backporfolio.cloudinary.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.cloudinary.entity.Imagen;
import com.backporfolio.cloudinary.repository.imagenRepository;

@Service
@Transactional
public class ImagenService {

	@Autowired
	imagenRepository imagenRepository;

	public List<Imagen> list() {
		return imagenRepository.findByOrderById();
	}

	public void save(Imagen imagen) {
		imagenRepository.save(imagen);
	}

	public void delete(int id) {
		imagenRepository.deleteById(id);
	}

	public Optional<Imagen> getOne(int id) {
		return imagenRepository.findById(id);
	}

	public boolean exists(int id) {
		return imagenRepository.existsById(id);
	}
}
