package com.example.tareaDos.service;

import com.example.tareaDos.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    void save(StudentDTO studentDTO);
    void update(StudentDTO studentDTO);
    void delete(Integer idStudent);
    List<StudentDTO> getAll();
    StudentDTO findById(Integer idStudent);
}
