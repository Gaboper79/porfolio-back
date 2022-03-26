package com.backporfolio.model;

public class Experiencia {

	private String empresa;
	private String img;
	private String descripcion;
	private String puesto;
	private String fechaInicio;
	private String fechaFin;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Experiencia() {

	}

	public Experiencia(String empresa, String img, String descripcion, String puesto, String fechaInicio,
			String fechaFin) {

		this.empresa = empresa;
		this.img = img;
		this.descripcion = descripcion;
		this.puesto = puesto;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

}
