package com.example.tareaDos.service;

import com.example.tareaDos.dto.TeacherDTO;

import java.util.List;

public interface ITeacherService {

    void save(TeacherDTO teacherDTO); //Guardar

    List<TeacherDTO> getAll(); //Método para obtener la lista de todos los profesoresDTO
    void update(TeacherDTO teacherDTO); //Actualizar ProfesorDTO
    void delete(Integer idTeacher); //Eliminar por ID un profesor
    TeacherDTO findById(Integer idTeacher); //Buscar por el IDTeacher

}
