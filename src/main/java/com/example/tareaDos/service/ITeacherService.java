package com.example.tareaDos.service;

import com.example.tareaDos.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface ITeacherService {

    void save(TeacherDTO teacherDTO);
    void update(TeacherDTO teacherDTO);
    void delete(Integer idTeacher);
    List<TeacherDTO> getAll();
    Optional<TeacherDTO> findById(Integer idTeacher);

}
