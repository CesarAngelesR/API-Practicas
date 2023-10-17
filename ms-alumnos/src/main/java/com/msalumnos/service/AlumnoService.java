package com.msalumnos.service;

import java.util.List;

import com.msalumnos.entity.Alumno;
import com.msalumnos.exception.NoSePuedeEditarException;
import com.msalumnos.request.AlumnoRequest;

public interface AlumnoService {
	
	/*Esta interfase engloba los metodos abstractos que son la logica del negocio u operaciones
	 * particulares del servicio o negocio donde se esta programando*/
	
	public Alumno guardar(AlumnoRequest request);
	public Alumno editar(AlumnoRequest request)throws NoSePuedeEditarException;
	public Alumno buscar(int id);
	public String eliminar(int id);
	public List<Alumno>mostrar();
} 
