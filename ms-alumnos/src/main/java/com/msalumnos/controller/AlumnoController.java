package com.msalumnos.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msalumnos.entity.Alumno;
import com.msalumnos.logic.AlumnoLogic;
import com.msalumnos.request.AlumnoRequest;

@RestController
@RequestMapping("alumno")
public class AlumnoController {
	//Inyectamos la dependencia de la clase de la logica o implementacion
	@Autowired
	AlumnoLogic service;
	
	//La respuesta la vamos a brindar mediante la clase ResponseEntity seria como el objeto
	//auxiliar Status que veniamos ocupando. Ella nos permite devolver el valor del objeto o
	//tipo de dato
	
	//http://localhost:8095/alumno/mostrar
	@GetMapping("mostrar")
	public ResponseEntity<List<Alumno>> mostrar(){
		//Creamos una lista, que va a recibir los datos del metodo de la clase AlumnoLogic
		//del objeto service y lo devolvemos con ResponseEntity hacia la vista
		List<Alumno> lista = service.mostrar();
		return new ResponseEntity<List<Alumno>>(lista,HttpStatus.OK);
	}
	//http://localhost:8095/alumno/guardar
	@PostMapping("guardar")
	public ResponseEntity<Alumno> guardar(@RequestBody AlumnoRequest request){
		Alumno alumno = service.guardar(request);
		return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
	}
	//http://localhost:8095/alumno/editar
	@PutMapping("editar")
	public ResponseEntity<Alumno> editar(@RequestBody AlumnoRequest request){
		Alumno alumno = service.editar(request);
		return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
	}
	//http://localhost:8095/alumno/buscar/id
	@GetMapping("buscar/{id}")
	public ResponseEntity<Alumno> buscar(@PathVariable int id){
		Alumno alumno = service.buscar(id);
		return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
	}
	//http://localhost:8095/alumno/eliminar/id
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String alumno = service.eliminar(id);
		return new ResponseEntity<String>(alumno,HttpStatus.OK);
	}
	//http://localhost:8095/alumno/inactivar/id
	@PatchMapping("inactivar/{id}")
	public ResponseEntity<String> inactivar(@PathVariable int id){
		String alumno = service.inactivar(id);
		return new ResponseEntity<String>(alumno,HttpStatus.OK);
	}
	

}
