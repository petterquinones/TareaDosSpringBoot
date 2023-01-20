package com.example.tareaDos.dto;

import com.example.tareaDos.repository.entity.Student;

import java.util.Date;

public class StudentDTO {
    private Integer IdentificationStudent;
    private String nameStudent;
    private String lasNameStudent;
    private Date dateOfBirth;

    public StudentDTO() {
    }

    public Integer getIdentificationStudent() {
        return IdentificationStudent;
    }

    public void setIdentificationStudent(Integer identificationStudent) {
        IdentificationStudent = identificationStudent;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public StudentDTO(Student student) {
        this.IdentificationStudent = student.getIdentificationStudent();
        this.nameStudent = student.getNameStudent();
        this.lasNameStudent = student.getLasNameStudent();
        this.dateOfBirth = student.getDateOfBirth();
        //Falta course
    }
}
