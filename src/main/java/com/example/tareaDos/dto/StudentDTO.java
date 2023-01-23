package com.example.tareaDos.dto;

import com.example.tareaDos.repository.entity.Student;

import java.time.LocalDate;
import java.util.Date;

public class StudentDTO {
    private Integer IdStudent;
    private String nameStudent;
    private String lasNameStudent;
    private LocalDate dateOfBirth;
    private CourseDTO courseDTO;

    public StudentDTO() {
    }

    public StudentDTO(Integer idStudent, String nameStudent, String lasNameStudent, LocalDate dateOfBirth, CourseDTO courseDTO) {
        IdStudent = idStudent;
        this.nameStudent = nameStudent;
        this.lasNameStudent = lasNameStudent;
        this.dateOfBirth = dateOfBirth;
        this.courseDTO = courseDTO;
    }
    public StudentDTO(Student student) {
        this.IdStudent = student.getIdStudent();
        this.nameStudent = student.getNameStudent();
        this.lasNameStudent = student.getLasNameStudent();
        this.dateOfBirth = student.getDateOfBirth();
        this.courseDTO = student.getCourse();

    }
    public Integer getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(Integer idStudent) {
        IdStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLasNameStudent() {
        return lasNameStudent;
    }

    public void setLasNameStudent(String lasNameStudent) {
        this.lasNameStudent = lasNameStudent;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }
}
