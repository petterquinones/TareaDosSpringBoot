package com.example.tareaDos.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue()//Indagar bien para que se usa antes de agregar al código y como se usa. en que casos es viable
    private Integer identificationCourse;
    @OneToMany() //Antes de agregar leer bien los parametros de esta relación uno a muchos
    private List<Student> studentsList;
    @ManyToOne
    @JoinColumn(name = "TEACHER-ID")
    private Teacher teacherCourse;
    @Column(name = "SCHEDULE", nullable = false)
    private String schedule;
    @Column(name = "ISSUE", nullable = false)
    private String issue;

    public Integer getIdentificationCourse() {
        return identificationCourse;
    }

    public void setIdentificationCourse(Integer identificationCourse) {
        this.identificationCourse = identificationCourse;
    }

    public List<Student> getStudentsList() {
        return studentsList;
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
}

//falta agregar los constructores
