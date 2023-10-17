package com.persistence.request;



public class SociosRequest {
	private int idSocio;
	
	private String nombre;
	
	private String direccion;
	
	private String telefono;
	
	private int antiguedad;
	
	private String nacionalidad;
	
	private String sexo;
	public SociosRequest() {}
	
	public SociosRequest(int idSocio, String nombre, String direccion, String telefono, int antiguedad,
			String nacionalidad, String sexo) {
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.antiguedad = antiguedad;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
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

}
