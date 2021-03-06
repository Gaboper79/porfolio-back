package com.backporfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "experiencia")
public class Experiencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String empresa;
	private int imgUser;
	private String descripcion;
	@NotNull
	private String puesto;
	private String fechaIni;
	private String fechaFin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Experiencia() {

	}

	public int getImgUser() {
		return imgUser;
	}

	public void setImgUser(int imgUser) {
		this.imgUser = imgUser;
	}

	public Experiencia(@NotNull String empresa, int imgUser, String descripcion, @NotNull String puesto,
			String fechaIni, String fechaFin) {
		super();
		this.empresa = empresa;
		this.imgUser = imgUser;
		this.descripcion = descripcion;
		this.puesto = puesto;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
	}

}
