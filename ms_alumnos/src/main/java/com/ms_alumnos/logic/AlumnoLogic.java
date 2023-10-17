package com.ms_alumnos.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms_alumnos.service.AlumnoService;
import com.persistence.entity.Alumno;
import com.persistence.repository.AlumnoRepository;
import com.persistence.request.AlumnoRequest;


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
	public Alumno editar(AlumnoRequest request) {
		// Buscamos al alumno existente en la base de datos y lo traemos a un objeto alumno manipilable
		Alumno alumno = dao.findById(request.getIdAlumno()).get();
		//Como podemos manejar un nullPointerException?
		//Hacerlo mediante una clase optional o con un stream
		alumno.setNombre(request.getNombre());
		alumno.setFechaNac(request.getFechaNac());
		alumno.setGenero(request.getGenero());
		alumno.setGrado(request.getGrado());
		dao.save(alumno);
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
}
