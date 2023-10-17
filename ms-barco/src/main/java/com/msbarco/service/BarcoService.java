package com.msbarco.service;

import java.util.List;

import com.persistence.entity.Barco;
import com.persistence.request.BarcoRequest;

public interface BarcoService {
		
		public Barco guardar(BarcoRequest request);
		public Barco editar(BarcoRequest request);
		public Barco buscar(int id);
		public String eliminar(int id);
		public List<Barco>mostrar();
}
