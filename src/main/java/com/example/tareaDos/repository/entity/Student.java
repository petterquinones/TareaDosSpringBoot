package com.example.tareaDos.repository.entity;

import com.example.tareaDos.dto.StudentDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Student {
    @Id
    private Integer IdentificationStudent;
    @Column(name="NAME_STUDENT", nullable = false)
    private String nameStudent;
    @Column(name ="LASTNAME_STUDENT", nullable = false)
    private String lasNameStudent;
    @Column(name="AGE-STUDENT")
    private Date dateOfBirth;

    public Student() {
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
    public Student(StudentDTO studentDTO) {
        this.IdentificationStudent = studentDTO.getIdentificationStudent();
        this.nameStudent = studentDTO.getNameStudent();
        this.lasNameStudent = studentDTO.getLasNameStudent();
        this.dateOfBirth = studentDTO.getDateOfBirth();
        //Falta course
    }
}
