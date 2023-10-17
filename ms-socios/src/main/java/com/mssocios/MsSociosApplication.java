package com.mssocios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//Cuando tenemos un proyecto con una unidad de persistencia, es decir que forma parte
//de este otro, hay que habilitar los repositorios y la lectura de entidades
@EnableJpaRepositories("com.persistence.repository")
@EntityScan("com.persistence.entity")
public class MsSociosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSociosApplication.class, args);
	}

}
