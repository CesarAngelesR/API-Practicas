package com.persistence.request;

import com.persistence.entity.Socios;

public class BarcoRequest {

	private int idBarco;
	private String nombre;
	private int amarre;
	private double cuota;
	private Socios Socio;
	
	public BarcoRequest() {}
	
	public BarcoRequest(int idBarco, String nombre, int amarre, double cuota, Socios Socio) {
		this.idBarco = idBarco;
		this.nombre = nombre;
		this.amarre = amarre;
		this.cuota = cuota;
		this.Socio = Socio;
	}


	public int getIdBarco() {
		return idBarco;
	}

	public void setIdBarco(int idBarco) {
		this.idBarco = idBarco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAmarre() {
		return amarre;
	}

	public void setAmarre(int amarre) {
		this.amarre = amarre;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public Socios getSocio() {
		return Socio;
	}

	public void setSocio(Socios Socio) {
		this.Socio = Socio;
	}
}
