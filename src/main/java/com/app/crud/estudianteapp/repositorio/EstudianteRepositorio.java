package com.app.crud.estudianteapp.repositorio;

import com.app.crud.estudianteapp.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {

}
