package com.example.tareaDos.dto;

import com.example.tareaDos.repository.entity.Student;
import com.example.tareaDos.repository.entity.Teacher;

import javax.persistence.*;
import java.util.List;

public class CourseDTO {

    private Integer identificationCourse;
    private List<StudentDTO> studentsList;
    private Teacher teacherCourse;
    private String schedule;
    private String issue;

    public Integer getIdentificationCourse() {
        return identificationCourse;
    }

    public void setIdentificationCourse(Integer identificationCourse) {
        this.identificationCourse = identificationCourse;
    }

    public List<StudentDTO> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<StudentDTO> studentsList) {
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
