package com.mssocios.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mssocios.service.SociosService;
import com.persistence.entity.Socios;
import com.persistence.repository.SociosRepository;
import com.persistence.request.SociosRequest;

@Service
public class SociosLogic implements SociosService{

		@Autowired
		SociosRepository dao;

		@Override
		public Socios guardar(SociosRequest request) {
	
			Socios socio=new Socios();

			socio.setNombre(request.getNombre());
			socio.setDireccion(request.getDireccion());
			socio.setTelefono(request.getTelefono());
			socio.setAntiguedad(request.getAntiguedad());
			socio.setNacionalidad(request.getNacionalidad());
			socio.setSexo(request.getSexo());

			dao.save(socio);	
			return socio;
		}

		@Override
		public Socios editar(SociosRequest request) {
			Socios socio = dao.findById(request.getIdSocio()).get();
			
			socio.setNombre(request.getNombre());
			socio.setDireccion(request.getDireccion());
			socio.setTelefono(request.getTelefono());
			socio.setAntiguedad(request.getAntiguedad());
			socio.setNacionalidad(request.getNacionalidad());
			socio.setSexo(request.getSexo());
			dao.save(socio);
			return socio;
		}

		@Override
		public Socios buscar(int id) {
			return dao.findById(id).get();
		}

		@Override
		public String eliminar(int id) {
			dao.deleteById(id);
			return "Registro Eliminado";
		}

		@Override
		public List<Socios> mostrar() {
			return dao.findAll();
		}
}