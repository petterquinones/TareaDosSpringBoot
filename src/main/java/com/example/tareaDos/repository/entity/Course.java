package com.example.tareaDos.repository.entity;

import com.example.tareaDos.dto.CourseDTO;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Course {
    @Id
    @GeneratedValue()//Indagar bien para que se usa antes de agregar al código y como se usa. en que casos es viable
    private Integer IdCourse;
    @JsonManagedReference
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //Antes de agregar leer bien los parametros de esta relación uno a muchos
    private List<Student> studentsList;
    @ManyToOne
    @JoinColumn(name = "teacher",referencedColumnName = "idTeacher")
    private Teacher teacherCourse;
    @Column(name = "SCHEDULE", nullable = false)
    private String schedule;
    @Column(name = "ISSUE", nullable = false)
    private String issue;

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public Integer getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(Integer IdCourse) {
        this.IdCourse = IdCourse;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public Teacher getTeacherCourse() {
        return teacherCourse;
    }

    public void setTeacherCourse(Teacher teacherCourse) {
        this.teacherCourse = teacherCourse;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Course() {
    }

    public Course(Integer IdCourse, List<Student> studentsList, Teacher teacherCourse, String schedule, String issue) {
        this.IdCourse = IdCourse;
        this.studentsList = studentsList;
        this.teacherCourse = teacherCourse;
        this.schedule = schedule;
        this.issue = issue;
    }

    public Course(CourseDTO courseDTO) {
           this.IdCourse = courseDTO.getIdCourse();

           //Creando un nuevo profesor
           this.teacherCourse = new Teacher(courseDTO.getTeacherCourse());

           //Me trae una lista de estudiantes del curso
           this.studentsList = courseDTO.getStudentsList()
                   .stream()
                   .map(Student::new)
                   .collect(Collectors.toList());

           this.schedule = courseDTO.getSchedule();
           this.issue = courseDTO.getIssue();

    }

}

