package com.example.tareaDos.service;

import com.example.tareaDos.dto.CourseDTO;

import java.util.List;

public interface ICourseService {
    void save(CourseDTO courseDTO);
    void update(CourseDTO courseDTO);
    void delete(Integer idCourse);
    List<CourseDTO>getAll();
    CourseDTO findById(Integer idCourse);

}
