package com.backporfolio.model;

public class Skills {

	private String skill;
	private String valor;

	public Skills() {

	}

	public Skills(String skill, String valor) {

		this.skill = skill;
		this.valor = valor;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
