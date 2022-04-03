package com.backporfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backporfolio.model.DatosPersonales;

public interface DatosPerRepository extends JpaRepository<DatosPersonales, Long> {

}
