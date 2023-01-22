package com.example.tareaDos.dto;

import com.example.tareaDos.repository.entity.Teacher;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;


public class TeacherDTO {
    private Integer idTeacher;
    private String nameTeacher;
    private String lastNameTeacher;
    private Integer ageTeacher;

    private List<CourseDTO> coursesDTO;

    public List<CourseDTO> getCoursesDTO() {
        return coursesDTO;
    }

    public void setCoursesDTO(List<CourseDTO> coursesDTO) {
        this.coursesDTO = coursesDTO;
    }

    public TeacherDTO() {
    }

    public TeacherDTO(Integer idTeacher, String nameTeacher, String lastNameTeacher, Integer ageTeacher, List<CourseDTO> coursesDTO) {
        this.idTeacher = idTeacher;
        this.nameTeacher = nameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.ageTeacher = ageTeacher;
        this.coursesDTO = coursesDTO;
    }

    public TeacherDTO(Teacher teacher) {
        this.idTeacher = teacher.getIdTeacher();
        this.nameTeacher = teacher.getNameTeacher();
        this.lastNameTeacher = teacher.getLastNameTeacher();
        this.ageTeacher = teacher.getAgeTeacher();
        this.coursesDTO = teacher.getCourses()
                .stream()
                .map(CourseDTO::new)
                .collect(Collectors.toList());
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Integer getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(Integer ageTeacher) {
        this.ageTeacher = ageTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

}
