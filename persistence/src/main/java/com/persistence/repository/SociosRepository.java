package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.persistence.entity.Socios;

@Repository
public interface SociosRepository extends JpaRepository<Socios,Integer>{

}
