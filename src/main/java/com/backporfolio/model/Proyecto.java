package com.backporfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String nombre;

	private String link;
	private String descripcion;
	private int imgUser;

	public Proyecto() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getImgUser() {
		return imgUser;
	}

	public void setImgUser(int imgUser) {
		this.imgUser = imgUser;
	}

	public Proyecto(Long id, @NotNull String nombre, String link, String descripcion, int imgUser) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.link = link;
		this.descripcion = descripcion;
		this.imgUser = imgUser;
	}

}
