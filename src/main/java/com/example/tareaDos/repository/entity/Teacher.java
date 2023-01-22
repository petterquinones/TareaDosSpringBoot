package com.example.tareaDos.repository.entity;

import com.example.tareaDos.dto.TeacherDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Teacher {
    @Id
    private Integer idTeacher;
    @Column(name="NAME_TEACHER", nullable = false)
    private String nameTeacher;
    @Column(name ="LASTNAME_TEACHER", nullable = false)
    private String lastNameTeacher;
    @Column(name="AGE-TEACHER")
    private Integer ageTeacher;

    @Column(name = "COURSES", nullable = false)
    private List<Course> courses;

    public Teacher() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Teacher(Integer idTeacher, String nameTeacher, String lastNameTeacher, Integer ageTeacher, List<Course> courses) {
        this.idTeacher = idTeacher;
        this.nameTeacher = nameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.ageTeacher = ageTeacher;
        this.courses = courses;
    }

    public Teacher(TeacherDTO teacherDTO) {
        this.idTeacher = teacherDTO.getIdTeacher();
        this.nameTeacher = teacherDTO.getNameTeacher();
        this.lastNameTeacher = teacherDTO.getLastNameTeacher();
        this.ageTeacher = teacherDTO.getAgeTeacher();
        this.courses = teacherDTO.getCoursesDTO()
                .stream()
                .map(Course::new)
                .collect(Collectors.toList());
    }

    public Teacher(Teacher teacherCourse) {
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
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

    public Integer getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(Integer ageTeacher) {
        this.ageTeacher = ageTeacher;
    }
}
