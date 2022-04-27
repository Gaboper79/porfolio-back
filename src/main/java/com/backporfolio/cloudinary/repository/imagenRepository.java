package com.backporfolio.cloudinary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backporfolio.cloudinary.entity.Imagen;

@Repository
public interface imagenRepository extends JpaRepository<Imagen, Integer> {

	List<Imagen> findByOrderById();
}
