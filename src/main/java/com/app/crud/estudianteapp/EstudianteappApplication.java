package com.app.crud.estudianteapp;

import com.app.crud.estudianteapp.entidad.Estudiante;
import com.app.crud.estudianteapp.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudianteappApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EstudianteappApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*Estudiante estu1 = new Estudiante("hoa","ape","hoa99@gmail.com");
		repositorio.save(estu1);

		Estudiante estu2 = new Estudiante("hoa1","ape1","hoa991@gmail.com");
		repositorio.save(estu2);*/
	}
}
