package com.backporfolio.model;

public class proyectos {

	private String nombre;
	private String link;
	private String descripcion;
	private String img;

	public proyectos() {

	}

	public proyectos(String nombre, String link, String descripcion, String img) {

		this.nombre = nombre;
		this.link = link;
		this.descripcion = descripcion;
		this.img = img;
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
