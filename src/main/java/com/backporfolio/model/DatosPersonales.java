package com.backporfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datos_personales")
public class DatosPersonales {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String imgUser;
	private String aboutMe;
	private String titulo;
	private String nombre;

	public DatosPersonales() {
		super();
	}

	public DatosPersonales(String imgUser, String aboutMe, String titulo, String nombre, RedesSociales redesSociales) {
		super();
		this.imgUser = imgUser;
		this.aboutMe = aboutMe;
		this.titulo = titulo;
		this.nombre = nombre;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
