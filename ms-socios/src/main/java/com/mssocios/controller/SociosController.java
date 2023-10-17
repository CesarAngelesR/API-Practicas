package com.mssocios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mssocios.logic.SociosLogic;
import com.persistence.entity.Socios;
import com.persistence.request.SociosRequest;

@RestController
@RequestMapping("socios")
public class SociosController {

	@Autowired
	SociosLogic service;

	@GetMapping("mostrar")
	public ResponseEntity<List<Socios>> mostrar(){
		List<Socios> lista = service.mostrar();
		return new ResponseEntity<List<Socios>>(lista,HttpStatus.OK);
	}

	@PostMapping("guardar")
	public ResponseEntity<Socios> guardar(@RequestBody SociosRequest request){
		Socios socio = service.guardar(request);
		return new ResponseEntity<Socios>(socio,HttpStatus.OK);
	}

	@PutMapping("editar")
	public ResponseEntity<Socios> editar(@RequestBody SociosRequest request){
		Socios socio = service.editar(request);
		return new ResponseEntity<Socios>(socio,HttpStatus.OK);
	}

	@GetMapping("buscar/{id}")
	public ResponseEntity<Socios> buscar(@PathVariable int id){
		Socios socio = service.buscar(id);
		return new ResponseEntity<Socios>(socio,HttpStatus.OK);
	}

	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String socio = service.eliminar(id);
		return new ResponseEntity<String>(socio,HttpStatus.OK);
	}

}

