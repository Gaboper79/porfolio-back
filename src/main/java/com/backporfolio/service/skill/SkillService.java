package com.backporfolio.service.skill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backporfolio.model.Skills;
import com.backporfolio.repository.SkillRepository;

@Service
public class SkillService implements ISkillService {

	@Autowired
	private SkillRepository skillRepo;

	@Override
	public List<Skills> getAllskill() {

		return skillRepo.findAll();
	}

	@Override
	public Skills saveSkill(Skills skill) {
		return skillRepo.save(skill);

	}

	@Override
	public void deleteSkill(Long id) {
		skillRepo.deleteById(id);

	}

	@Override
	public Skills findById(Long id) {

		return skillRepo.findById(id).orElse(null);
	}

}
