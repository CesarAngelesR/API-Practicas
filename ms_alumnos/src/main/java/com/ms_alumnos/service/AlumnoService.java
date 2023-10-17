package com.ms_alumnos.service;

import java.util.List;

import com.persistence.entity.Alumno;
import com.persistence.request.AlumnoRequest;


public interface AlumnoService{
	
	/*Esta interfase engloba los metodos abstractos que son la logica del negocio u operaciones
	 * particulares del servicio o negocio donde se esta programando*/
	
	public Alumno guardar(AlumnoRequest request);
	public Alumno editar(AlumnoRequest request);
	public Alumno buscar(int id);
	public String eliminar(int id);
	public List<Alumno>mostrar();
}