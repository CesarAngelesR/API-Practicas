package com.msalumnos.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ALUMNO")
public class Alumno implements Serializable{
	
	//La interfase serializable nos permite descomponer adecuadamente un objeto en bits
	//para poder llevarlo a un front o vista
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="aid_auto")
	@SequenceGenerator(name="aid_auto",sequenceName="ALUMNO_SEQ",allocationSize = 1)//Se incrementa en 1
	@Column(name="ID_ALUMNO",columnDefinition = "NUMBER")
	private int idAlumno;
	@Column(name="NOMBRE",columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	@Column(name="FECHA_NAC",columnDefinition = "DATE")
	private LocalDateTime fechaNac;
	@Column(name="GENERO",columnDefinition = "NVARCHAR2(10)")
	private String genero;
	@Column(name="GRADO",columnDefinition = "NVARCHAR2(20)")
	private String grado;
	@Column(name="STATUS",columnDefinition = "NUMBER")
	private int status;
	public Alumno() {}
	public Alumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDateTime fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
