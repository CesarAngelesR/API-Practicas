package com.mssocios.service;

import java.util.List;

import com.persistence.entity.Socios;
import com.persistence.request.SociosRequest;

public interface SociosService {
	public Socios guardar(SociosRequest request);
	public Socios editar(SociosRequest request);
	public Socios buscar(int id);
	public String eliminar(int id);
	public List<Socios>mostrar();
}
