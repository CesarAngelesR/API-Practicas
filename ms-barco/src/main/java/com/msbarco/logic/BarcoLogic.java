package com.msbarco.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msbarco.service.BarcoService;
import com.persistence.entity.Barco;
import com.persistence.repository.BarcoRepository;
import com.persistence.request.BarcoRequest;

@Service
public class BarcoLogic implements BarcoService{
	@Autowired
	BarcoRepository dao;

	@Override
	public Barco guardar(BarcoRequest request) {
		Barco barco=new Barco();

		barco.setNombre(request.getNombre());
		barco.setAmarre(request.getAmarre());
		barco.setCuota(request.getCuota());
		barco.setSocio(request.getSocio());

		dao.save(barco);	
		return barco;
	}

	@Override
	public Barco editar(BarcoRequest request) {
		Barco barco = dao.findById(request.getIdBarco()).get();

		barco.setNombre(request.getNombre());
		barco.setAmarre(request.getAmarre());
		barco.setCuota(request.getCuota());
		barco.setSocio(request.getSocio());

		dao.save(barco);	
		return barco;
	}

	@Override
	public Barco buscar(int id) {
		return dao.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);
		return "Registro Eliminado";
	}

	@Override
	public List<Barco> mostrar() {
		return dao.findAll();
	}

}
