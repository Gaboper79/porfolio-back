package com.backporfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backporfolio.model.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {

}
