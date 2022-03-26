package com.backporfolio.model;

public class RedesSociales {

	private String twiter;
	private String fb;
	private String ws;
	private String github;

	public RedesSociales() {

	}

	public RedesSociales(String twiter, String fb, String ws, String github) {

		this.twiter = twiter;
		this.fb = fb;
		this.ws = ws;
		this.github = github;
	}

	public String getTwiter() {
		return twiter;
	}

	public void setTwiter(String twiter) {
		this.twiter = twiter;
	}

	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

	public String getWs() {
		return ws;
	}

	public void setWs(String ws) {
		this.ws = ws;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

}
