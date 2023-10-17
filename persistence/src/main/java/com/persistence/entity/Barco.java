package com.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name="BARCO")
public class Barco implements Serializable{
	
	//La interfase serializable nos permite descomponer adecuadamente un objeto en bits
	//para poder llevarlo a un front o vista
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="aid_auto")
	@SequenceGenerator(name="aid_auto",sequenceName="SOCIO_SEQ",allocationSize = 1)//Se incrementa en 1
	@Column(name="ID_BARCO",columnDefinition = "NUMBER")
	private int idBarco;
	@Column(name="NOMBRE",columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	@Column(name="NUME_AMARRE",columnDefinition = "NUMBER")
	private int amarre;
	@Column(name="CUOTA",columnDefinition = "NUMBER")
	private double cuota;
	@ManyToOne
	@JoinColumn(name="ID_SOCIO", columnDefinition = "NUMBER")
	private Socios Socio;

	
	public Barco() {}
	
	public Barco(int idBarco, String nombre, int amarre, double cuota, Socios Socio) {
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

	public Socios Socio() {
		return Socio;
	}

	public void setSocio(Socios Socio) {
		this.Socio = Socio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

