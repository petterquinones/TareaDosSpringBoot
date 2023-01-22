package com.example.tareaDos.dto;

import com.example.tareaDos.repository.entity.Course;
import com.example.tareaDos.repository.entity.Student;
import com.example.tareaDos.repository.entity.Teacher;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

public class CourseDTO {

    private Integer idCourse;

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    private List<StudentDTO> studentsList;
    private TeacherDTO teacherCourse;
    private String schedule;
    private String issue;

    public Integer getIdCourse() {
        return idCourse;
    }


    public List<StudentDTO> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<StudentDTO> studentsList) {
        this.studentsList = studentsList;
    }

    public String getSchedule() {
        return schedule;
    }

    public TeacherDTO getTeacherCourse() {
        return teacherCourse;
    }

    public void setTeacherCourse(TeacherDTO teacherCourse) {
        this.teacherCourse = teacherCourse;
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

    public CourseDTO() {
    }

    public CourseDTO(Integer idCourse, List<StudentDTO> studentsList, TeacherDTO teacherCourse, String schedule, String issue) {
        this.idCourse = idCourse;
        this.studentsList = studentsList;
        this.teacherCourse = teacherCourse;
        this.schedule = schedule;
        this.issue = issue;
    }

    public CourseDTO(Course course) {
        this.idCourse = course.getIdCourse();
        this.teacherCourse = new TeacherDTO(course.getTeacherCourse());
        this.studentsList = course.getStudentsList()
                .stream()
                .map(StudentDTO::new)
                .collect(Collectors.toList());
        this.schedule = course.getSchedule();
        this.issue = getIssue();

    }

}
