package com.backporfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backporfolio.model.Skills;

public interface SkillRepository extends JpaRepository<Skills, Long> {

}
