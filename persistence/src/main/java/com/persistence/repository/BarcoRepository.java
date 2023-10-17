package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Barco;

@Repository
public interface BarcoRepository extends JpaRepository<Barco,Integer>{

}
