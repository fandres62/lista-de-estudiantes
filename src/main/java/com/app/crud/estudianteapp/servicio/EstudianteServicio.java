package com.app.crud.estudianteapp.servicio;

import com.app.crud.estudianteapp.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {

    public List<Estudiante> listarTodosLosEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiantePorID(Long id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long id);
}
