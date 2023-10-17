package com.msalumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msalumnos.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Integer>{//Interfase que va a estar encargada del patron DAO
	//Interface de Acceso a datos DAO
	//Operaciones necesarias para persistir los datos
	//En caso de necesitar alguna consulta especifica, se puede declarar aqui con un
	//metodo propio

}
