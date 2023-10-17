package com.msalumnos.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msalumnos.entity.Alumno;
import com.msalumnos.exception.NoSePuedeEditarException;
import com.msalumnos.repository.AlumnoRepository;
import com.msalumnos.request.AlumnoRequest;
import com.msalumnos.service.AlumnoService;

@Service
public class AlumnoLogic implements AlumnoService{
	//Tambien pueden encontrar esta clase o paquete con el nombre de Impl
	
	//Inyectamos la dependencia del Repositorio
	@Autowired//Inyeccion de dependencias
	AlumnoRepository dao;

	@Override
	public Alumno guardar(AlumnoRequest request) {
		// Instanciamos un nuevo alumno para guardar
		Alumno alumno=new Alumno();
		//La info que recibimos del exterior, se recibe primero en Alumnorequest,
		//y se le pasa el valor a este objeto Alumno
		alumno.setNombre(request.getNombre());
		alumno.setFechaNac(request.getFechaNac());
		alumno.setGenero(request.getGenero());
		alumno.setGrado(request.getGrado());
		alumno.setStatus(1);
		//una vez establecidos los valores del alumno a guardar indicamos al dao
		//que guarde en la base de datos
		dao.save(alumno);	
		return alumno;
	}

	@Override
	public Alumno editar(AlumnoRequest request) throws NoSePuedeEditarException{
		// Buscamos al alumno existente en la base de datos y lo traemos a un objeto alumno manipilable
		Alumno alumno = dao.findById(request.getIdAlumno()).get();
		//Como podemos manejar un nullPointerException?
		//Hacerlo mediante una clase optional o con un stream
		
		//Vamos a plantear un panorama donde el negocio nos pida poder editar los valores de alumnos activos
		//es decir con status 1
		
		if(alumno.getStatus()==1) {
			alumno.setNombre(request.getNombre());
			alumno.setFechaNac(request.getFechaNac());
			alumno.setGenero(request.getGenero());
			alumno.setGrado(request.getGrado());
			dao.save(alumno);
		}else {
			throw new NoSePuedeEditarException("No se puede editar un alumno dado de baja");
		}
			
		return alumno;
	}

	@Override
	public Alumno buscar(int id) {
		return dao.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);
		return "Registro Eliminado";
	}

	@Override
	public List<Alumno> mostrar() {
		return dao.findAll();
	}
	//Vamos a crear un metodo propio para cambiar el status de un alumno
	//Es decir, darlo de baja al cambiar su estatus a 0
	public String inactivar(int id) {
		Alumno alumno = dao.findById(id).get();
		alumno.setStatus(0);
		dao.save(alumno);
		return "Alumno dado de baja exitosamente";
	}
}