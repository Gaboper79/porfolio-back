package com.backporfolio.service.skill;

import java.util.List;

import com.backporfolio.model.Skills;

public interface ISkillService {
	public List<Skills> getAllskill();

	public Skills saveSkill(Skills skill);

	public void deleteSkill(Long id);

	public Skills findById(Long id);

}
