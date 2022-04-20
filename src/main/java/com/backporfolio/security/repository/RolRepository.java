package com.backporfolio.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backporfolio.security.entity.Rol;
import com.backporfolio.security.enums.RolNombre;

public interface RolRepository extends JpaRepository<Rol, Integer> {
	Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
