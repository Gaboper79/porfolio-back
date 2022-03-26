package com.backporfolio.model;

public class DatosPersonales {

	private String imgUser;
	private String aboutMe;
	private String titulo;
	private String nombre;
	private RedesSociales redesSociales;

	public DatosPersonales() {
		super();
	}

	public DatosPersonales(String imgUser, String aboutMe, String titulo, String nombre, RedesSociales redesSociales) {
		super();
		this.imgUser = imgUser;
		this.aboutMe = aboutMe;
		this.titulo = titulo;
		this.nombre = nombre;
		this.redesSociales = redesSociales;
	}

	public String getImgUser() {
		return imgUser;
	}

	public void setImgUser(String imgUser) {
		this.imgUser = imgUser;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public RedesSociales getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(RedesSociales redesSociales) {
		this.redesSociales = redesSociales;
	}

}
