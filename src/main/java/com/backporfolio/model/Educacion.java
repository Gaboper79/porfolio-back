package com.backporfolio.model;

public class Educacion {

	private String tirulo;
	private String fecha;
	private String institucion;

	public Educacion() {

	}

	public Educacion(String tirulo, String fecha, String institucion) {

		this.tirulo = tirulo;
		this.fecha = fecha;
		this.institucion = institucion;
	}

	public String getTirulo() {
		return tirulo;
	}

	public void setTirulo(String tirulo) {
		this.tirulo = tirulo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

}
