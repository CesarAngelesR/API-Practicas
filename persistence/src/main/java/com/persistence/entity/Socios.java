package com.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="SOCIOS")
public class Socios implements Serializable{
	
	//La interfase serializable nos permite descomponer adecuadamente un objeto en bits
	//para poder llevarlo a un front o vista
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="aid_auto")
	@SequenceGenerator(name="aid_auto",sequenceName="SOCIO_SEQ",allocationSize = 1)//Se incrementa en 1
	@Column(name="ID_SOCIO",columnDefinition = "NUMBER")
	private int idSocio;
	@Column(name="NOMBRE",columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	@Column(name="DIRECCION",columnDefinition = "NVARCHAR2(30)")
	private String direccion;
	@Column(name="TELEFONO",columnDefinition = "NVARCHAR2(30)")
	private String telefono;
	@Column(name="ANTIGUEDAD",columnDefinition = "NUMBER")
	private int antiguedad;
	@Column(name="NACIONALIDAD",columnDefinition = "NVARCHAR2(30)")
	private String nacionalidad;
	@Column(name="SEXO",columnDefinition = "NVARCHAR2(30)")
	private String sexo;
	@OneToMany(mappedBy="Socio")
	private List<Barco> barco;
	
	

	
	public Socios(int idSocio, String nombre, String direccion, String telefono, int antiguedad, String nacionalidad,
			String sexo, List<Barco> barco) {
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.antiguedad = antiguedad;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.barco = barco;
	}

	public List<Barco> getBarco() {
		return barco;
	}

	public void setBarco(List<Barco> barco) {
		this.barco = barco;
	}

	public Socios() {}
	
	public Socios(int idSocio) {
		this.idSocio = idSocio;
	}
	
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

