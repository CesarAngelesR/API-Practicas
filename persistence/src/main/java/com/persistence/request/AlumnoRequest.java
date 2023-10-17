package com.persistence.request;

import java.time.LocalDateTime;


public class AlumnoRequest {
	
	//Esta es la clase POJO - Plain Old Java Object (objeto plano)
	//Esta clase nos va servir para validacion de datos
	//Es decir, la informacion que se envia en JSON desde el exterior,
	//se recibe primero aqui, antes de pasar a la capa entity
	//y guardanse en la base de datos
	
	private int idAlumno;
	private String nombre;
	private LocalDateTime fechaNac;
	private String genero;
	private String grado;
	private int status;
	
	public AlumnoRequest() {}
	public AlumnoRequest(int idAlumno, String nombre, LocalDateTime fechaNac, String genero, String grado, int status) {
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.genero = genero;
		this.grado = grado;
		this.status = status;
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

	

}