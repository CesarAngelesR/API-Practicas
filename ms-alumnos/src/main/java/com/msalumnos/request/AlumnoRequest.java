package com.msalumnos.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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
}
