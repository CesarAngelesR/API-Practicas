package com.msbarco.controller;

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

import com.msbarco.logic.BarcoLogic;
import com.persistence.entity.Barco;
import com.persistence.request.BarcoRequest;


@RestController
@RequestMapping("barco")
public class BarcoController {
	@Autowired
	BarcoLogic service;
	
	@GetMapping("mostrar")
	public ResponseEntity<List<Barco>> mostrar(){
		List<Barco> lista = service.mostrar();
		return new ResponseEntity<List<Barco>>(lista,HttpStatus.OK);
	}

	@PostMapping("guardar")
	public ResponseEntity<Barco> guardar(@RequestBody BarcoRequest request){
		Barco barco = service.guardar(request);
		return new ResponseEntity<Barco>(barco,HttpStatus.OK);
	}

	@PutMapping("editar")
	public ResponseEntity<Barco> editar(@RequestBody BarcoRequest request){
		Barco barco = service.editar(request);
		return new ResponseEntity<Barco>(barco,HttpStatus.OK);
	}

	@GetMapping("buscar/{id}")
	public ResponseEntity<Barco> buscar(@PathVariable int id){
		Barco barco = service.buscar(id);
		return new ResponseEntity<Barco>(barco,HttpStatus.OK);
	}

	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String barco = service.eliminar(id);
		return new ResponseEntity<String>(barco,HttpStatus.OK);
	}

}
